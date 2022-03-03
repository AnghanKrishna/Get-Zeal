package com.example.getzeals

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
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

        binding.ivMenu.setOnClickListener {
            binding.myDrawerLayout.openDrawer(GravityCompat.START)
        }

        binding.nvSideBar.ivClose.setOnClickListener {
            binding.myDrawerLayout.closeDrawer(GravityCompat.START)
        }

        binding.btnFilter.setOnClickListener {
            val intent = Intent(this, FiltersActivity::class.java)
            startActivity(intent)
        }

//        add new details to recyclerview and set the same in Adapter on viewHolder()
        binding.llHomeContent.rvCard.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val card = ArrayList<OfferModel>()
        card.add(OfferModel(R.drawable.card1, "Miami, FL, USA", "KFC", true))
        card.add(
            OfferModel(
                R.drawable.card2,
                "Waghawadi Road Bhavnagar",
                "Special 15% Discount",
                true
            )
        )
        card.add(OfferModel(R.drawable.card3, "Miami, FL, USA", "Starbucks Offer", true))
        card.add(OfferModel(R.drawable.card4, "Miami, FL, USA", "Get An Exciting 45%", true))
        card.add(OfferModel(R.drawable.card5, "Miami, FL, USA", "Test New Offer", true))
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

                if (posi.img == 2131165287 || posi.img == 2131165288 || posi.img == 2131165289 || posi.img == 2131165290 || posi.img == 2131165291) {
                    val offerDetail = Intent(this@HomeActivity, OfferDetailActivity::class.java)
                    startActivity(offerDetail)
                }
            }
        })

    }

    //      will close the app
    override fun onBackPressed() {
        moveTaskToBack(true)
//        super.onBackPressed()
    }
}