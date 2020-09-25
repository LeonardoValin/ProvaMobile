package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainProva : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prova_main)
        irParaHomeProva()
    }

    private fun irParaHomeProva() {
        val intent = Intent(this, HomeProva::class.java)

        Handler().postDelayed({
            intent.change()
        }, 2500)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }
}