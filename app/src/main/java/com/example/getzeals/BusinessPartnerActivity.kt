package com.example.getzeals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.getzeals.databinding.ActivityBusinessPartnerBinding

class BusinessPartnerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBusinessPartnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessPartnerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSigninPartner.setOnClickListener {
            val intentSignin = Intent(this, SigninBusinessPartner::class.java)
            startActivity(intentSignin)
        }

        binding.ivHelp.setOnClickListener {
            Toast.makeText(this, "Need Help??", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        val intentBack= Intent(this,HomeActivity::class.java)
        startActivity(intentBack)
    }
}