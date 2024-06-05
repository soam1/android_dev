package com.example.housemartapplication.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.housemartapplication.R

class LoginActivity : AppCompatActivity() {
    lateinit var passwordLoginEdtText: EditText
    lateinit var mobileLoginEdtText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        /*
        //unnecesary for now
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        */

        mobileLoginEdtText = findViewById(R.id.mobile_login_et)
        passwordLoginEdtText = findViewById(R.id.password_login_et)

        findViewById<Button>(R.id.signup_link_btn).setOnClickListener {
            //startActivity(Intent(this, SignUpActivity::class.java))
        }

        findViewById<Button>(R.id.login_btn).setOnClickListener {
            loginUser()
            //loginViewModel.login(mobileLoginEdtText.text.toString(), passwordLoginEdtText.text.toString())
        }

    }

    private fun loginUser() {
        TODO("Not yet implemented")
    }
}