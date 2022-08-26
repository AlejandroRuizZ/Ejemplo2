package com.example.ejemplo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTxtNombre = findViewById<EditText>(R.id.txtNombre)
        val myNumEdad = findViewById<EditText>(R.id.numEdad)
        val myButtonSubmit = findViewById<Button>(R.id.button)

        myButtonSubmit.setOnClickListener{
            var elNombre: String = myTxtNombre.text.toString()
            var laEdad : Int = parseInt(myNumEdad.text.toString())

            val myIntent = Intent(this, TargetActivity::class.java)
            myIntent.putExtra("keyName", elNombre)
            myIntent.putExtra("keyEdad", laEdad)
            startActivity(myIntent)
        }

        Log.d("Example2","Fin de la ejecucion de onCreate de Main Activity.")
    }
}