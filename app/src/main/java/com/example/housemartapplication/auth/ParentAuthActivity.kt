package com.example.housemartapplication.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.housemartapplication.R
import com.example.housemartapplication.auth.login.LoginActivity
import com.example.housemartapplication.auth.register.RegisterActivity

class ParentAuthActivity : AppCompatActivity() {
    lateinit var userAuthButton: Button
    lateinit var vendorAuthButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_parent_auth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        userAuthButton = findViewById<Button>(R.id.userAuthButton)
        vendorAuthButton = findViewById<Button>(R.id.vendorAuthButton)

        userAuthButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        vendorAuthButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    }
}