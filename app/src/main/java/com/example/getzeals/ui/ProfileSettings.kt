package com.example.getzeals.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.adapters.ViewPagerAdapter
import com.example.getzeals.databinding.ActivityProfileSettingsBinding

class ProfileSettings : AppCompatActivity() {

    private lateinit var binding: ActivityProfileSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityProfileSettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llHeader.setOnClickListener {
            var back= Intent(this,SidebarProfileActivity::class.java)
            startActivity(back)
        }

        binding.viewpager.adapter = ViewPagerAdapter(supportFragmentManager)
//        default 0th tab will be display
        binding.viewpager.currentItem =0
        //link tab with the viewpager
        binding.tabLayout.setupWithViewPager(binding.viewpager)
    }
}