package com.example.getzeals.ui

import com.example.getzeals.adapters.OfferAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.getzeals.R
import com.example.getzeals.databinding.ActivityHomeBinding
import com.example.getzeals.models.OfferModel
import kotlin.collections.ArrayList

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivMenu.setOnClickListener {
            binding.myDrawerLayout.openDrawer(GravityCompat.START)
        }

        binding.nvSideBar.ivClose.setOnClickListener {
            binding.myDrawerLayout.closeDrawer(GravityCompat.START)
        }

        binding.nvSideBar.tvProfile.setOnClickListener {
            val intentProfile = Intent(this, SidebarProfileActivity::class.java)
            startActivity(intentProfile)
        }

        binding.nvSideBar.tvPartnerBusiness.setOnClickListener {
            val intentPartner = Intent(this, SignupBusinessPartner::class.java)
            startActivity(intentPartner)
        }

        binding.btnFilter.setOnClickListener {
            val intentFilter = Intent(this, FiltersActivity::class.java)
            startActivity(intentFilter)
        }

//        add new details to recyclerview and set the same in Adapter on viewHolder()
        binding.llHomeContent.rvCard.layoutManager =
            GridLayoutManager(this, 2)
        val card = ArrayList<OfferModel>()
        card.add(OfferModel(R.drawable.card1, "Miami, FL, \nUSA", "KFC", true))
        card.add(
            OfferModel(
                R.drawable.card2,
                "Waghawadi Road Bhavnagar",
                "Special 15% Discount",
                true
            )
        )
        card.add(OfferModel(R.drawable.card3, "KFC, \nTouchstone", "Starbucks Offer", true))
        card.add(
            OfferModel(
                R.drawable.card4,
                "Mission Brewing \nCompany ",
                "Get An Exciting 45%",
                true
            )
        )
        card.add(OfferModel(R.drawable.card5, "Miami, FL, \nUSA", "Test New Offer", true))
        val adapter = OfferAdapter(card)
        binding.llHomeContent.rvCard.adapter = adapter

//        list cardView click listener
        adapter.setupListener(object : OfferAdapter.OnItemClicked {
            override fun itemClicked(position: Int) {
                val posi = card[position]
//                Log.i(TAG, "Card $posi")

//              set true if item is clicked
                card.forEachIndexed { index, filterModel ->
                    filterModel.isClicked = index == position
                }

                if (posi.img == 2131165298 || posi.img == 2131165299 || posi.img == 2131165300 || posi.img == 2131165301 || posi.img == 2131165302) {
                    val offerDetail = Intent(this@HomeActivity, OfferDetailActivity::class.java)
                    startActivity(offerDetail)
                }
            }
        })

    }

//          will close the app
    override fun onBackPressed() {
        moveTaskToBack(true)
    }
}