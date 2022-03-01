package com.example.getzeals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

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