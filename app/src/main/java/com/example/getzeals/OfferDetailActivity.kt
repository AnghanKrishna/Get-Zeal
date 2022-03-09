package com.example.getzeals

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
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
        binding.llInfo.setBackgroundResource(R.drawable.bg_card_gray)

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

            binding.llWhatIsZeal.setBackgroundColor(Color.WHITE)
            binding.llWork.setBackgroundColor(Color.WHITE)
            binding.llInfo.setBackgroundResource(
                if (binding.tvInfo.isClickable)
                    R.drawable.bg_card_gray
                else
                    R.drawable.bg_card_white
            )
        }

        binding.tvWhatAreZeal.setOnClickListener {
            binding.inZeal.llAboutZeal.visibility = GONE
            binding.inZeal.llWhatAreZeal.visibility = VISIBLE
            binding.inZeal.llZealWork.visibility = GONE

            binding.llInfo.setBackgroundColor(Color.WHITE)
            binding.llWork.setBackgroundColor(Color.WHITE)
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

            binding.llInfo.setBackgroundColor(Color.WHITE)
            binding.llWhatIsZeal.setBackgroundColor(Color.WHITE)
            binding.llWork.setBackgroundResource(
                if (binding.tvZealWork.isClickable)
                    R.drawable.bg_card_gray
                else
                    R.drawable.bg_card_white
            )
        }

//        share page through social media
        binding.ivMail.setOnClickListener {
            val message = "mail to getZeal"
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.setPackage(message)
            share.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(share, "GetZeal Mail"))
        }

        binding.ivFacebook.setOnClickListener {
            val message = "com.facebook.katana"
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.setPackage(message)
            share.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(share, "GetZeal Facebook"))
        }

        binding.ivTwitter.setOnClickListener {
            val message = "com.twitter.android"
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.setPackage(message)
            share.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(share, "GetZeal Twitter"))
        }

        binding.ivPinterest.setOnClickListener {
            val message = "com.pinterest"
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.setPackage(message)
            share.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(share, "GetZeal Pinterest"))
        }

        binding.ivInstagram.setOnClickListener {
            val message = "com.instagram.android"
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.setPackage(message)
            share.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(Intent.createChooser(share, "GetZeal Instagram"))
        }

//        open instagram page
//        binding.ivInstagram.setOnClickListener {
//            val uri = Uri.parse("https://www.instagram.com/instagram/?hl=en")
//            val likeIng = Intent(Intent.ACTION_VIEW, uri)
//            likeIng.setPackage("com.instagram.android")
//            try {
//                startActivity(likeIng)
//            } catch (e: ActivityNotFoundException) {
//                startActivity(
//                    Intent(
//                        Intent.ACTION_VIEW,
//                        Uri.parse("https://www.instagram.com/instagram/?hl=en")
//                    )
//                )
//            }
//        }
    }
}