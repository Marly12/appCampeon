package com.example.appcampeonato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_campeonato.*


class LoginCampeonatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_campeonato)

        TxtRegistrar.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        })

        TbtLoginConectar.setOnClickListener(View.OnClickListener{

            if(eTxtUsuario.getText().toString().equals("Deporte") && eTxtPassword.getText().toString().equals("Deporte123")){
                startActivity(Intent(this, MenuActivity::class.java))
            }
            else if(eTxtUsuario.getText().toString().equals("Equipo") && eTxtPassword.getText().toString().equals("Equipo123")){
                startActivity(Intent(this, MenuActivity::class.java))

            }
            else if(eTxtUsuario.getText().toString().equals("Deportista") && eTxtPassword.getText().toString().equals("Deportista123")){
                startActivity(Intent(this, MenuActivity::class.java))

            }

        })



    }
}