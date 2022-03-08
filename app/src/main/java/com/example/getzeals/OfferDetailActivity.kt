package com.example.getzeals

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.getzeals.databinding.ActivityOfferDetailBinding

class OfferDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfferDetailBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityOfferDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationIcon(R.drawable.arrow_back)
        binding.tvInfo.setBackgroundResource( R.drawable.bg_card_gray)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        binding.btnReward.setOnClickListener {
            Toast.makeText(this, "Your Reward has been Claimed", Toast.LENGTH_SHORT).show()
        }

        binding.tvInfo.setOnClickListener {
            binding.inZeal.llAboutZeal.visibility = VISIBLE
            binding.inZeal.llWhatAreZeal.visibility = GONE
            binding.inZeal.llZealWork.visibility = GONE

            binding.tvWhatAreZeal.setBackgroundColor(Color.WHITE)
            binding.tvZealWork.setBackgroundColor(Color.WHITE)
            binding.llInfo.setBackgroundResource(
                if (binding.tvInfo.isClickable)
                    R.drawable.bg_card_gray
                else
                    R.drawable.bg_card_white
            )
        }

        binding.tvWhatAreZeal.setOnClickListener {
            binding.tvWhatAreZeal.setBackgroundColor(Color.BLACK)
            binding.inZeal.llAboutZeal.visibility = GONE
            binding.inZeal.llWhatAreZeal.visibility = VISIBLE
            binding.inZeal.llZealWork.visibility = GONE

            binding.tvInfo.setBackgroundColor(Color.WHITE)
            binding.tvZealWork.setBackgroundColor(Color.WHITE)
            binding.llWhatIsZeal.setBackgroundResource(
                if (binding.tvWhatAreZeal.isClickable)
                    R.drawable.bg_card_gray
                else
                    R.drawable.bg_card_white
            )
        }

        binding.tvZealWork.setOnClickListener {
            binding.inZeal.llAboutZeal.visibility = GONE
            binding.inZeal.llWhatAreZeal.visibility = GONE
            binding.inZeal.llZealWork.visibility = VISIBLE

            binding.tvInfo.setBackgroundColor(Color.WHITE)
            binding.tvWhatAreZeal.setBackgroundColor(Color.WHITE)
            binding.llWork.setBackgroundResource(
                if (binding.tvZealWork.isClickable)
                    R.drawable.bg_card_gray
                else
                    R.drawable.bg_card_white
            )
        }
    }
}