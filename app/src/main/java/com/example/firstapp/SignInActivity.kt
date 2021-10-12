package com.example.firstapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view: android.view.View) {
        if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Заполните все поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }


}