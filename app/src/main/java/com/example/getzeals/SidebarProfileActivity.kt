package com.example.getzeals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.databinding.ActivitySidebarProfileBinding

class SidebarProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySidebarProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //hide the app name on tool bar
        binding = ActivitySidebarProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvAccount.setOnClickListener {
            var account=Intent(this,ProfileAccount::class.java)
            startActivity(account)
        }

        binding.cvBankAccount.setOnClickListener {
            var bankaccount=Intent(this,ProfileBankAccount::class.java)
            startActivity(bankaccount)
        }
    }
}