package com.example.getzeals

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.getzeals.databinding.ActivityFiltersBinding

class FiltersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFiltersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivityFiltersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnApply.setOnClickListener {
            Toast.makeText(this, "Filter Applied", Toast.LENGTH_SHORT).show()
        }

//      add new details to recyclerview1 and set the same in Adapter on viewHolder()
        binding.rvFilterList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val filter = ArrayList<FilterModel>()
        filter.add(FilterModel("Business Type", true))
        filter.add(FilterModel("Food Type", false))
        filter.add(FilterModel("Event Type", false))
        filter.add(FilterModel("Location", false))
        filter.add(FilterModel("Distance", false))
        val adapterList = FilterAdapter()
        binding.rvFilterList.adapter = adapterList

//      add new details to recyclerview2 and set the same in Adapter on viewHolder()
        binding.rvFilterDescription.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val filtermore = ArrayList<FilterMoreModel>()
        filtermore.add(FilterMoreModel("Bar / Lounge"))
        filtermore.add(FilterMoreModel("Brewery"))
        filtermore.add(FilterMoreModel("Beer Garden"))
        filtermore.add(FilterMoreModel("Liquor Store"))
        filtermore.add(FilterMoreModel("Bottle Shop"))
        filtermore.add(FilterMoreModel("NightClub"))
        filtermore.add(FilterMoreModel("Pub"))
        filtermore.add(FilterMoreModel("Coffee House"))
        filtermore.add(FilterMoreModel("Restaurant"))
        filtermore.add(FilterMoreModel("Hotel"))
        filtermore.add(FilterMoreModel("Fast Food"))
        filtermore.add(FilterMoreModel("Deli"))
        filtermore.add(FilterMoreModel("Fine Dining"))
        filtermore.add(FilterMoreModel("Casual Dining"))
        filtermore.add(FilterMoreModel("Cafe"))
        filtermore.add(FilterMoreModel("Bistro"))
        filtermore.add(FilterMoreModel("Movie Theatre"))
        filtermore.add(FilterMoreModel("Billards"))
        filtermore.add(FilterMoreModel("Bowling"))
        filtermore.add(FilterMoreModel("Sports"))
        val adaptermore = FilterMoreAdapter()
        binding.rvFilterDescription.adapter = adaptermore
        adapterList.updateFilter(filter)
        adaptermore.updateData(filtermore)

//      gets the position of clicked item from the recyclerview and act as per it
        adapterList.setupListener(object : FilterAdapter.OnItemClicked {
            override fun itemClicked(position: Int) {
                val posi = filter[position]

//                set true if item is clicked
                filter.forEachIndexed { index, filterModel ->
                    filterModel.isClicked = index == position
                }
                adapterList.updateFilter(filter)
                filtermore.clear()  //clear the old data in rv and new data loaded

                when (posi.filterName) {
                    "Business Type" -> {
                        filtermore.add(FilterMoreModel("Bar / Lounge"))
                        filtermore.add(FilterMoreModel("Brewery"))
                        filtermore.add(FilterMoreModel("Beer Garden"))
                        filtermore.add(FilterMoreModel("Liquor Store"))
                        filtermore.add(FilterMoreModel("Bottle Shop"))
                        filtermore.add(FilterMoreModel("NightClub"))
                        filtermore.add(FilterMoreModel("Pub"))
                        filtermore.add(FilterMoreModel("Coffee House"))
                        filtermore.add(FilterMoreModel("Restaurant"))
                        filtermore.add(FilterMoreModel("Hotel"))
                        filtermore.add(FilterMoreModel("Fast Food"))
                        filtermore.add(FilterMoreModel("Deli"))
                        filtermore.add(FilterMoreModel("Fine Dining"))
                        filtermore.add(FilterMoreModel("Casual Dining"))
                        filtermore.add(FilterMoreModel("Cafe"))
                        filtermore.add(FilterMoreModel("Bistro"))
                        filtermore.add(FilterMoreModel("Movie Theatre"))
                        filtermore.add(FilterMoreModel("Billards"))
                        filtermore.add(FilterMoreModel("Bowling"))
                        filtermore.add(FilterMoreModel("Sports"))
                        adaptermore.updateData(filtermore)
                    }
                    "Food Type" -> {
                        filtermore.add(FilterMoreModel("Burgers"))
                        filtermore.add(FilterMoreModel("Asian"))
                        filtermore.add(FilterMoreModel("Breakfast"))
                        filtermore.add(FilterMoreModel("BBQ"))
                        filtermore.add(FilterMoreModel("Sandwiches"))
                        filtermore.add(FilterMoreModel("Salads"))
                        filtermore.add(FilterMoreModel("Chinese"))
                        filtermore.add(FilterMoreModel("Thai"))
                        filtermore.add(FilterMoreModel("Pizza"))
                        filtermore.add(FilterMoreModel("Mexican"))
                        filtermore.add(FilterMoreModel("Tex Mex"))
                        filtermore.add(FilterMoreModel("Vegan"))
                        filtermore.add(FilterMoreModel("Japanese"))
                        filtermore.add(FilterMoreModel("Indian"))
                        filtermore.add(FilterMoreModel("Italian"))
                        filtermore.add(FilterMoreModel("Middle Eastern"))
                        filtermore.add(FilterMoreModel("Sushi"))
                        filtermore.add(FilterMoreModel("Steak House"))
                        filtermore.add(FilterMoreModel("Seafood"))
                        filtermore.add(FilterMoreModel("Greek"))
                        adaptermore.updateData(filtermore)
                    }
                    "Event Type" -> {
                        filtermore.add(FilterMoreModel("Sports"))
                        filtermore.add(FilterMoreModel("Concerts"))
                        filtermore.add(FilterMoreModel("Live Music"))
                        filtermore.add(FilterMoreModel("DJ's"))
                        filtermore.add(FilterMoreModel("Nightlife"))
                        filtermore.add(FilterMoreModel("Community"))
                        filtermore.add(FilterMoreModel("Festival"))
                        filtermore.add(FilterMoreModel("Movies"))
                        filtermore.add(FilterMoreModel("Karoake"))
                        filtermore.add(FilterMoreModel("Dancing"))
                        filtermore.add(FilterMoreModel("Cabaret"))
                        filtermore.add(FilterMoreModel("Comedy"))
                        filtermore.add(FilterMoreModel("Happy Hour"))
                        filtermore.add(FilterMoreModel("Trivia"))
                        filtermore.add(FilterMoreModel("Pool/Darts"))
                        filtermore.add(FilterMoreModel("Tasting Events"))
                        adaptermore.updateData(filtermore)
                    }
                    "Location" -> {
                        filtermore.add(FilterMoreModel("Location1"))
                        filtermore.add(FilterMoreModel("Location2"))
                        adaptermore.updateData(filtermore)
                    }
                    "Distance" -> {
                        filtermore.add(FilterMoreModel("Distance1"))
                        filtermore.add(FilterMoreModel("Distance2"))
                        adaptermore.updateData(filtermore)
                    }
                    else -> {
                        filtermore.add(FilterMoreModel("No Filters"))
                        adaptermore.updateData(filtermore)
                    }
                }
            }
        })

    }

    override fun onBackPressed() {
        val intent=Intent(this,HomeActivity::class.java)
        startActivity(intent)
    }
}