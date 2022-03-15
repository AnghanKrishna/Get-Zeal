package com.example.getzeals.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.getzeals.databinding.ActivitySidebarProfileBinding

class SidebarProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySidebarProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivitySidebarProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvAccount.setOnClickListener {
            var account=Intent(this, ProfileAccount::class.java)
            startActivity(account)
        }

        binding.cvProfile.setOnClickListener {
            var profile=Intent(this, ProfileSettings::class.java)
            startActivity(profile)
        }

        binding.cvEarning.setOnClickListener {
            var earning=Intent(this, ProfileEarning::class.java)
            startActivity(earning)
        }

        binding.cvBankAccount.setOnClickListener {
            var bankaccount=Intent(this, ProfileBankAccount::class.java)
            startActivity(bankaccount)
        }

        binding.cvManageCards.setOnClickListener {
            Toast.makeText(this, "Coming Soon......", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onBackPressed() {
        val intentBack= Intent(this, HomeActivity::class.java)
        startActivity(intentBack)
    }
}