package com.example.getzeals

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvlogin: TextView
    private lateinit var tvsignup: TextView
    private lateinit var flmain: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        setContentView(R.layout.activity_main)

//change the status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.pink)
        }

        tvlogin = findViewById(R.id.loginid)
        tvsignup = findViewById(R.id.signupid)
        flmain = findViewById(R.id.flmain)

        loginFragment() //default login fragment called on app launch

//        click listener on login and signup text
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