package com.example.getzeals

import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var signin: TextView
    lateinit var signup: TextView
    private val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signin = findViewById(R.id.signin)
        signup = findViewById(R.id.signup)
        signin.setOnClickListener (loginDailog)
        signup.setOnClickListener (signupDailog)

    }

    private var loginDailog = View.OnClickListener {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.logindailog_layout)
        dialog.show()
    }

    private var signupDailog = View.OnClickListener {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.signupdailog_layout)
        dialog.show()
    }

}