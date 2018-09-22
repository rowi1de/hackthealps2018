package com.hackthealps.paylocal.nfc

import android.nfc.cardemulation.HostApduService
import android.os.Bundle

class HostCardEmulatorService : HostApduService() {
    companion object {
        val TAG = "Host Card Emulator"
        val STATUS_SUCCESS = "9000"
        val STATUS_FAILED = "6F00"
        val CLA_NOT_SUPPORTED = "6E00"
        val INS_NOT_SUPPORTED = "6D00"
        val AID = "A0000002471001"
        val SELECT_INS = "A4"
        val DEFAULT_CLA = "00"
        val MIN_APDU_LENGTH = 12
    }

    override fun onDeactivated(reason: Int) {

    }

    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?): ByteArray {
        if (commandApdu == null) {
            return NfcUtils.hexStringToByteArray(STATUS_FAILED)
        }

        val hexCommandApdu = NfcUtils.toHex(commandApdu)
        if (hexCommandApdu.length < MIN_APDU_LENGTH) {
            return NfcUtils.hexStringToByteArray(STATUS_FAILED)
        }

        if (hexCommandApdu.substring(0, 2) != DEFAULT_CLA) {
            return NfcUtils.hexStringToByteArray(CLA_NOT_SUPPORTED)
        }

        if (hexCommandApdu.substring(2, 4) != SELECT_INS) {
            return NfcUtils.hexStringToByteArray(INS_NOT_SUPPORTED)
        }

        if (hexCommandApdu.substring(10, 24) == AID)  {
            return NfcUtils.hexStringToByteArray(STATUS_SUCCESS)
        } else {
            return NfcUtils.hexStringToByteArray(STATUS_FAILED)
        }
    }

}
