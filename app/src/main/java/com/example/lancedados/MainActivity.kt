package com.example.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)
        val dado1 = findViewById<ImageView>(R.id.dado1)
        val dado2 = findViewById<ImageView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            dado1.setImageResource(lancarDado())
            dado2.setImageResource(lancarDado())
        }
    }

    fun lancarDado(): Int {
        return recuperaFaceDado(gerarNumero())
    }

    fun recuperaFaceDado(valor: Int): Int{
        return when(valor){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun gerarNumero(): Int{
        return (1..6).random()
    }

}

