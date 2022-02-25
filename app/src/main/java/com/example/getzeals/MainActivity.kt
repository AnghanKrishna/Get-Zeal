package com.example.getzeals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvlogin: TextView
    private lateinit var tvsignup: TextView
    private lateinit var flmain: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        tvlogin = findViewById(R.id.loginid)
        tvsignup = findViewById(R.id.signupid)
        flmain = findViewById(R.id.flmain)

        tvlogin.setOnClickListener {
            loginFragment()
        }
        tvsignup.setOnClickListener {
            signupFragment()
        }
    }

    //calling fragment in cardview
    private fun loginFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val loginfrag = LoginFragment()
        fragmentTransaction.add(R.id.flmain, loginfrag)
        fragmentTransaction.commit()
    }

    //calling fragment in cardview
    private fun signupFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val signupfrag = SignupFragment()
        fragmentTransaction.add(R.id.flmain, signupfrag)
        fragmentTransaction.commit()
    }
}