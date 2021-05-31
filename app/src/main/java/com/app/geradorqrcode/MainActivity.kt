package com.app.calculadora.geradorqrcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.app.geradorqrcode.packageapp.gerador.GeradorGeral
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var buttonGerar : Button
    lateinit var inputLink : TextInputEditText
    lateinit var qrCode : ImageView

    val gerador = GeradorGeral()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        buttonGerar.setOnClickListener {
            val link = inputLink.text.toString()
            gerador(link)
        }
    }

    fun init() {
        this.buttonGerar = findViewById(R.id.buttonGerar)
        this.inputLink = findViewById(R.id.inputLink)
        this.qrCode = findViewById(R.id.qrCode)
    }

    fun gerador(link : String) {
        //val linkText : TextView = findViewById(R.id.outPutLink)
        val texto = gerador.gerador(link)
        qrCode.setImageBitmap(texto)
    }
}