package com.example.getzeals.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.databinding.ActivityProfileEarningBinding

class ProfileEarning : AppCompatActivity() {

    private lateinit var binding:ActivityProfileEarningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfileEarningBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llHeader.setOnClickListener {
            val back= Intent(this,SidebarProfileActivity::class.java)
            startActivity(back)
        }
    }
}