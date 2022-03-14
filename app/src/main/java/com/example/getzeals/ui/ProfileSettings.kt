package com.example.getzeals.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.getzeals.R
import com.example.getzeals.databinding.ActivityProfileSettingsBinding

class ProfileSettings : AppCompatActivity() {

    private lateinit var binding: ActivityProfileSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityProfileSettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvUser.visibility = View.VISIBLE
        binding.ivNav1.setBackgroundResource(R.drawable.bg_card_pink_light)

        binding.ivNav1.setOnClickListener {
            binding.cvUser.visibility = View.VISIBLE
            binding.cvPassword.visibility = View.GONE
            binding.cvAbout.visibility = View.GONE
            binding.ivNav1.setBackgroundResource(R.drawable.bg_card_pink_light)
            binding.ivNav2.setBackgroundResource(R.drawable.bg_card_white)
            binding.ivNav3.setBackgroundResource(R.drawable.bg_card_white)
        }

        binding.ivNav2.setOnClickListener {
            binding.cvPassword.visibility = View.VISIBLE
            binding.cvUser.visibility = View.GONE
            binding.cvAbout.visibility = View.GONE
            binding.ivNav1.setBackgroundResource(R.drawable.bg_card_white)
            binding.ivNav2.setBackgroundResource(R.drawable.bg_card_pink_light)
            binding.ivNav3.setBackgroundResource(R.drawable.bg_card_white)
        }

        binding.ivNav3.setOnClickListener {
            binding.cvAbout.visibility = View.VISIBLE
            binding.cvUser.visibility = View.GONE
            binding.cvPassword.visibility = View.GONE
            binding.ivNav1.setBackgroundResource(R.drawable.bg_card_white)
            binding.ivNav2.setBackgroundResource(R.drawable.bg_card_white)
            binding.ivNav3.setBackgroundResource(R.drawable.bg_card_pink_light)
        }

        binding.cvMale.setOnClickListener {
            binding.llDate.visibility = View.VISIBLE
            binding.cvMale.setBackgroundResource(R.drawable.bg_card_gray)
            binding.cvFemale.setBackgroundResource(R.drawable.bg_card_white)
            binding.cvSelfId.setBackgroundResource(R.drawable.bg_card_white)
        }
        binding.cvFemale.setOnClickListener {
            binding.llDate.visibility = View.VISIBLE
            binding.cvMale.setBackgroundResource(R.drawable.bg_card_white)
            binding.cvFemale.setBackgroundResource(R.drawable.bg_card_gray)
            binding.cvSelfId.setBackgroundResource(R.drawable.bg_card_white)
        }
        binding.cvSelfId.setOnClickListener {
            binding.llDate.visibility = View.VISIBLE
            binding.cvMale.setBackgroundResource(R.drawable.bg_card_white)
            binding.cvFemale.setBackgroundResource(R.drawable.bg_card_white)
            binding.cvSelfId.setBackgroundResource(R.drawable.bg_card_gray)
        }
    }
}