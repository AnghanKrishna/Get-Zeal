package com.example.getzeals

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.getzeals.databinding.ActivityOfferDetailBinding

class OfferDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfferDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityOfferDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationIcon(R.drawable.arrow_back)
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        binding.tvInfo.setOnClickListener {
            binding.inZeal.llAboutZeal.visibility=View.VISIBLE
            binding.inZeal.llWhatAreZeal.visibility=View.INVISIBLE
            binding.inZeal.llZealWork.visibility=View.INVISIBLE
        }

        binding.tvWhatAreZeal.setOnClickListener {
            binding.inZeal.llWhatAreZeal.visibility=View.VISIBLE
            binding.inZeal.llAboutZeal.visibility=View.INVISIBLE
            binding.inZeal.llZealWork.visibility=View.INVISIBLE
        }

        binding.tvZealWork.setOnClickListener {
            binding.inZeal.llZealWork.visibility=View.VISIBLE
            binding.inZeal.llAboutZeal.visibility=View.INVISIBLE
            binding.inZeal.llWhatAreZeal.visibility=View.INVISIBLE
        }
    }
}