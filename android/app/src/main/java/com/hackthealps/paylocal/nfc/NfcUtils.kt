package com.hackthealps.paylocal.nfc

import java.util.*

// Source: https://medium.com/the-almanac/how-to-build-a-simple-smart-card-emulator-reader-for-android-7975fae4040f

object NfcUtils {
    private val SELECT_APDU_HEADER = "00A40400"
    const val STATUS_SUCCESS = "9000"
    const val STATUS_FAILED = "6F00"

    private val HEX_CHARS = "0123456789ABCDEF"
    private val HEX_CHARS_ARRAY = "0123456789ABCDEF".toCharArray()

    fun hexStringToByteArray(data: String) : ByteArray {
        val result = ByteArray(data.length / 2)
        for (i in 0 until data.length step 2) {
            val firstIndex = HEX_CHARS.indexOf(data[i])
            val secondIndex = HEX_CHARS.indexOf(data[i + 1])

            val octet = firstIndex.shl(4).or(secondIndex)
            result.set(i.shr(1), octet.toByte())
        }

        return result
    }


    fun toHex(byteArray: ByteArray) : String {
        val result = StringBuffer()
        byteArray.forEach {
            val octet = it.toInt()
            val firstIndex = (octet and 0xF0).ushr(4)
            val secondIndex = octet and 0x0F
            result.append(HEX_CHARS_ARRAY[firstIndex])
            result.append(HEX_CHARS_ARRAY[secondIndex])
        }

        return result.toString()
    }

    /**
     * Utility method to concatenate two byte arrays.
     * @param first First array
     * @param rest Any remaining arrays
     * @return Concatenated copy of input arrays
     */
    fun concatArrays(first: ByteArray, vararg rest: ByteArray): ByteArray {
        var totalLength = first.size
        for (array in rest) {
            totalLength += array.size
        }
        val result = Arrays.copyOf(first, totalLength)
        var offset = first.size
        for (array in rest) {
            System.arraycopy(array, 0, result, offset, array.size)
            offset += array.size
        }
        return result
    }

    /**
     * Build APDU for SELECT AID command. This command indicates which service a reader is
     * interested in communicating with. See ISO 7816-4.
     *
     * @param aid Application ID (AID) to select
     * @return APDU for SELECT AID command
     */
    fun buildSelectApdu(aid: String): ByteArray {
        // Format: [CLASS | INSTRUCTION | PARAMETER 1 | PARAMETER 2 | LENGTH | DATA]
        return hexStringToByteArray(SELECT_APDU_HEADER + String.format("%02X",
                aid.length / 2) + aid)
    }
}