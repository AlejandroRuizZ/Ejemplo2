package com.example.ejemplo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myTxtNombre = findViewById<TextView>(R.id.textView6)
        val myNumEdad = findViewById<TextView>(R.id.textView6)

        var myExtras : Bundle? = intent.extras

        var nombreRecibido : String = myExtras?.getString("keyNombre")?:"NoName"
        var edadRecibido: Int = myExtras?.getInt("keyEdad")?:-1
        Log.d("Example2","FIn de la ejecucion de onCreate de Target Activity.")
    }


}