package com.example.getzeals

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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

//        default selected footer option
//        binding.llInfo.setBackgroundResource(R.drawable.bg_card_pink)
        binding.tvInfo.setTextColor(ContextCompat.getColor(this,R.color.pink))
        binding.ivInfo.setColorFilter(ContextCompat.getColor(this,R.color.pink))

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        binding.btnReward.setOnClickListener {
            Toast.makeText(this, "Your Reward has been Claimed", Toast.LENGTH_SHORT).show()
        }

        binding.llInfo.setOnClickListener {
            binding.inZeal.llContent1.visibility = VISIBLE
            binding.inZeal.llContent2.visibility = GONE
            binding.inZeal.llContent3.visibility = GONE
            binding.tvInfo.setTextColor(ContextCompat.getColor(this,R.color.pink))
            binding.ivInfo.setColorFilter(ContextCompat.getColor(this,R.color.pink))
//            not selected option
            binding.tvWhatAreZeal.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivWhatAreZeal.setColorFilter(ContextCompat.getColor(this,R.color.gray))
            binding.tvZealWork.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivZealWork.setColorFilter(ContextCompat.getColor(this,R.color.gray))
        }

        binding.llWhatAreZeal.setOnClickListener {
            binding.inZeal.llContent1.visibility = GONE
            binding.inZeal.llContent2.visibility = VISIBLE
            binding.inZeal.llContent3.visibility = GONE
            binding.tvWhatAreZeal.setTextColor(ContextCompat.getColor(this,R.color.pink))
            binding.ivWhatAreZeal.setColorFilter(ContextCompat.getColor(this,R.color.pink))
//            not selected option
            binding.tvInfo.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivInfo.setColorFilter(ContextCompat.getColor(this,R.color.gray))
            binding.tvZealWork.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivZealWork.setColorFilter(ContextCompat.getColor(this,R.color.gray))
        }

        binding.llZealWork.setOnClickListener {
            binding.inZeal.llContent1.visibility = GONE
            binding.inZeal.llContent2.visibility = GONE
            binding.inZeal.llContent3.visibility = VISIBLE
            binding.tvZealWork.setTextColor(ContextCompat.getColor(this,R.color.pink))
            binding.ivZealWork.setColorFilter(ContextCompat.getColor(this,R.color.pink))
//            not selected option
            binding.tvInfo.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivInfo.setColorFilter(ContextCompat.getColor(this,R.color.gray))
            binding.tvWhatAreZeal.setTextColor(ContextCompat.getColor(this,R.color.gray))
            binding.ivWhatAreZeal.setColorFilter(ContextCompat.getColor(this,R.color.gray))
        }

        binding.ivShare.setOnClickListener {
            showBottomSheetDialog()
        }


//        share page through social media
//        binding.ivMail.setOnClickListener {
//            val message = "mail to getZeal"
//            val share = Intent(Intent.ACTION_SEND)
//            share.type = "text/plain"
//            share.setPackage(message)
//            share.putExtra(Intent.EXTRA_TEXT, message)
//            startActivity(Intent.createChooser(share, "GetZeal Mail"))
//        }
//
//        binding.ivFacebook.setOnClickListener {
//            val message = "com.facebook.katana"
//            val share = Intent(Intent.ACTION_SEND)
//            share.type = "text/plain"
//            share.setPackage(message)
//            share.putExtra(Intent.EXTRA_TEXT, message)
//            startActivity(Intent.createChooser(share, "GetZeal Facebook"))
//        }
//
//        binding.ivTwitter.setOnClickListener {
//            val message = "com.twitter.android"
//            val share = Intent(Intent.ACTION_SEND)
//            share.type = "text/plain"
//            share.setPackage(message)
//            share.putExtra(Intent.EXTRA_TEXT, message)
//            startActivity(Intent.createChooser(share, "GetZeal Twitter"))
//        }
//
//        binding.ivPinterest.setOnClickListener {
//            val message = "com.pinterest"
//            val share = Intent(Intent.ACTION_SEND)
//            share.type = "text/plain"
//            share.setPackage(message)
//            share.putExtra(Intent.EXTRA_TEXT, message)
//            startActivity(Intent.createChooser(share, "GetZeal Pinterest"))
//        }
//
//        binding.ivInstagram.setOnClickListener {
//            val message = "com.instagram.android"
//            val share = Intent(Intent.ACTION_SEND)
//            share.type = "text/plain"
//            share.setPackage(message)
//            share.putExtra(Intent.EXTRA_TEXT, message)
//            startActivity(Intent.createChooser(share, "GetZeal Instagram"))
//        }
//
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

    private fun showBottomSheetDialog() {
//        val bottomSheetDialog = BottomSheetDialog(this)
//        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog)

//        val copy = bottomSheetDialog.findViewById<LinearLayout>(R.id.llMail)
//        val share = bottomSheetDialog.findViewById<LinearLayout>(R.id.shareLinearLayout)
//        val upload = bottomSheetDialog.findViewById<LinearLayout>(R.id.uploadLinearLayout)
//        val download = bottomSheetDialog.findViewById<LinearLayout>(R.id.download)
//        val delete = bottomSheetDialog.findViewById<LinearLayout>(R.id.delete)
//
//        bottomSheetDialog.show()
    }
}