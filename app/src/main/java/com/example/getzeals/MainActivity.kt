package com.example.getzeals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginFragment() //default login fragment called on app launch
//        click listener on login and signup text
        binding.tvLogin.setOnClickListener {
            loginFragment()
        }
        binding.tvSignUp.setOnClickListener {
            signupFragment()
        }
    }

    //calling fragment in cardView
    private fun loginFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val loginFrag = LoginFragment()
        fragmentTransaction.add(R.id.flMain, loginFrag)
        fragmentTransaction.commit()
    }

    //calling fragment in cardView
    private fun signupFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val signupFrag = SignupFragment()
        fragmentTransaction.add(R.id.flMain, signupFrag)
        fragmentTransaction.commit()
    }
}