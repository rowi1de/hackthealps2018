package com.hackthealps.paylocal_reader.ui

import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.IsoDep
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.hackthealps.paylocal_reader.R
import com.hackthealps.paylocal_reader.nfc.NfcUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.nio.charset.Charset
import java.util.*

class MainActivity : AppCompatActivity(), NfcAdapter.ReaderCallback {
    private val TAG = MainActivity::class.java.simpleName
    private val READER_FLAGS = NfcAdapter.FLAG_READER_NFC_A or NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK
    private val AID = "F222222222"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableReaderMode()
    }

    private fun enableReaderMode() {
        Log.d(TAG, "Enabling reader mode")
        val nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        nfcAdapter.enableReaderMode(this, this, READER_FLAGS, null)
    }

    private fun disableReaderMode() {
        Log.d(TAG, "Disabling reader mode")
        val nfcAdapter = NfcAdapter.getDefaultAdapter(this)
        nfcAdapter.disableReaderMode(this)
    }

    override fun onResume() {
        super.onResume()
        enableReaderMode()
    }

    override fun onPause() {
        super.onPause()
        disableReaderMode()
    }

    override fun onTagDiscovered(tag: Tag?) {
        Log.d(TAG, "New tag discovered")
        //log_tv.text = "${log_tv.text} \n New tag discovered"
        // Android's Host-based Card Emulation (HCE) feature implements the ISO-DEP (ISO 14443-4)
        // protocol.
        //
        // In order to communicate with a device using HCE, the discovered tag should be processed
        // using the IsoDep class.
        val isoDep = IsoDep.get(tag)
        if (isoDep != null) {
            try {
                // Connect to the remote NFC device
                isoDep.connect()
                // Build SELECT AID command for our loyalty card service.
                // This command tells the remote device which service we wish to communicate with.
                Log.d(TAG, "Requesting remote AID: $AID")
                //log_tv.text = "${log_tv.text} \n Requesting remote AID: $AID"
                val command = NfcUtils.buildSelectApdu(AID)
                // Send command to remote device
                Log.d(TAG, "Sending: " + NfcUtils.toHex(command))
                //log_tv.text = "${log_tv.text} \n Sending: ${NfcUtils.toHex(command)}"
                val result = isoDep.transceive(command)
                // If AID is successfully selected, 0x9000 is returned as the status word (last 2
                // bytes of the result) by convention. Everything before the status word is
                // optional payload, which is used here to hold the account number.
                val resultLength = result.size
                val statusWord = byteArrayOf(result[resultLength - 2], result[resultLength - 1])
                val payload = Arrays.copyOf(result, resultLength - 2)
                if (Arrays.equals(NfcUtils.hexStringToByteArray(NfcUtils.STATUS_SUCCESS), statusWord)) {
                    // The remote NFC device will immediately respond with its transaction data
                    val transactionId = String(payload, Charset.forName("UTF-8"))
                    Log.d(TAG, "Transaction received: $transactionId")
                    //log_tv.text = "${log_tv.text} \n Transaction received: $transactionId"
                    handleTransaction(transactionId)
                }
            } catch (e: IOException) {
                Log.e(TAG, "Error communicating with card: " + e.toString())
                //log_tv.text = "${log_tv.text} \n Error communicating with card"
            }

        }
    }

    private fun handleTransaction(transactionId: String) {

    }
}
