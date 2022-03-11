package com.example.getzeals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.getzeals.databinding.ActivitySigninBusinessPartnerBinding

class SigninBusinessPartner : AppCompatActivity() {

    private lateinit var binding: ActivitySigninBusinessPartnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBusinessPartnerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSignupPartner.setOnClickListener {
            val intentSignup= Intent(this,SignupBusinessPartner::class.java)
            startActivity(intentSignup)
        }

        binding.tvSigninPartner.setOnClickListener {
            val intentSignin= Intent(this,SignupBusinessPartner::class.java)
            startActivity(intentSignin)
        }

        binding.ivHelp.setOnClickListener {
            Toast.makeText(this, "Need Help??", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        val intentBack= Intent(this,SignupBusinessPartner::class.java)
        startActivity(intentBack)
    }
}