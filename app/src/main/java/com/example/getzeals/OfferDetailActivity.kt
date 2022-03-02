package com.example.getzeals

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.getzeals.databinding.ActivityOfferDetailBinding

class OfferDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfferDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityOfferDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

//        get data from OfferAdapter
        binding.tvTitle.text = intent.getStringExtra("name")
    }
}