package com.example.getzeals

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.TextView
import com.example.getzeals.databinding.ActivityHomeBinding
import com.example.getzeals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//change the status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.pink)
        }

        loginFragment() //default login fragment called on app launch

//        click listener on login and signup text
        binding.tvLogin.setOnClickListener {
            loginFragment()
        }
        binding.tvSignUp.setOnClickListener {
            signupFragment()
        }
    }

    //calling fragment in cardview
    private fun loginFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val loginfrag = LoginFragment()
        fragmentTransaction.add(R.id.flMain, loginfrag)
        fragmentTransaction.commit()
    }

    //calling fragment in cardview
    private fun signupFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val signupfrag = SignupFragment()
        fragmentTransaction.add(R.id.flMain, signupfrag)
        fragmentTransaction.commit()
    }
}