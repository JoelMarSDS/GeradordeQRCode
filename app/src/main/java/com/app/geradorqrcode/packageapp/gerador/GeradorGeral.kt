package com.app.geradorqrcode.packageapp.gerador

import android.graphics.Bitmap
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.journeyapps.barcodescanner.BarcodeEncoder
import java.nio.channels.MulticastChannel
import java.util.*

class GeradorGeral {
    fun gerador(link : String): Bitmap?{
        val multiFormatWriter = MultiFormatWriter()
        try {
            val bitMatrix : BitMatrix = multiFormatWriter.encode(link, BarcodeFormat.QR_CODE, 200, 200)
            val barcodeEncoder = BarcodeEncoder()
            return barcodeEncoder.createBitmap(bitMatrix)
        } catch (e : WriterException){
            e.stackTrace
        }
        return null
    }
}