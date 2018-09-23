package com.hackthealps.paylocal.nfc

import android.nfc.cardemulation.HostApduService
import android.os.Bundle
import android.util.Log
import com.hackthealps.paylocal.nfc.NfcUtils.STATUS_FAILED
import com.hackthealps.paylocal.nfc.NfcUtils.STATUS_SUCCESS
import java.util.*

class HostCardEmulatorService : HostApduService() {
    companion object {
        val TAG = HostCardEmulatorService::class.java.simpleName
        val AID = "F222222222"
        // unique user identifier. This should be handled to the app when
        // the user authenticates for the first time with the backend
        val TOKEN = "TID1234567"
    }

    override fun onDeactivated(reason: Int) {
        // TODO handle deactivations
    }

    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?): ByteArray {
        Log.i(TAG, "Received APDU: " + commandApdu?.let { NfcUtils.toHex(it) })
        if (Arrays.equals(NfcUtils.buildSelectApdu(AID), commandApdu)) {
            val transactionId = "$TOKEN+${generateTransactionKey()}"
            val transactionBytes = transactionId.toByteArray()
            Log.i(TAG, "Sending transaction number: $transactionId")
            return NfcUtils.concatArrays(transactionBytes, NfcUtils.hexStringToByteArray(STATUS_SUCCESS))
        } else {
            return NfcUtils.hexStringToByteArray(STATUS_FAILED)
        }
    }

    private fun generateTransactionKey() = UUID.randomUUID()
}
