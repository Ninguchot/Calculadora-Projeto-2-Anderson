package com.calculadora.ninguchot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

    }
        fun AcrescentearUmaExpressao(string: String, limpar_dados : Boolean){

            if (resultado.text.isNotEmpty()){
                expressao.text = " "
            }

            if (limpar_dados){
                resultado.text = " "
                expressao.append(String)
            }else{
                expressao.append(resultado.text)
                expressao.append(string)
                resultado.text = " "
            }
        }
}