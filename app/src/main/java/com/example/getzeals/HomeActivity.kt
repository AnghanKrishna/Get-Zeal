package com.example.getzeals

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.getzeals.databinding.ActivityHomeBinding
import kotlin.collections.ArrayList

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //change the status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.pink)
        }

        binding.ivMenu.setOnClickListener {
            binding.myDrawerLayout.openDrawer(GravityCompat.START)
        }
        binding.navSideBar.ivclose.setOnClickListener {
            binding.myDrawerLayout.closeDrawer(GravityCompat.START)
        }
        binding.btnFilter.setOnClickListener {
            var intent=Intent(this,FiltersActivity::class.java)
            startActivity(intent)
        }

//        add new details to recyclerview and set the same in Adapter on viewHolder()
        binding.llHomeContent.rvCard.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val card = ArrayList<OfferModel>()
        card.add(OfferModel(R.drawable.card1,"Miami, FL, USA","KFC"))
        card.add(OfferModel(R.drawable.card2,"Waghawadi Road Bhavnagar","Special 15% Discount"))
        card.add(OfferModel(R.drawable.card3,"Miami, FL, USA","Starbucks Offer"))
        card.add(OfferModel(R.drawable.card4,"Miami, FL, USA","Get An Exciting 45%"))
        card.add(OfferModel(R.drawable.card5,"Miami, FL, USA","Test New Offer"))
        val adapter = OfferAdapter(card)
        binding.llHomeContent.rvCard.adapter = adapter
    }
}