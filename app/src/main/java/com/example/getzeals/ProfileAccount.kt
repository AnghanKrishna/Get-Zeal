package com.example.getzeals

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getzeals.databinding.ProfileAccountBinding

class ProfileAccount : AppCompatActivity() {

    private lateinit var binding: ProfileAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ProfileAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivLinkBank.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(applicationContext)
        dialog.setContentView(R.layout.link_bank_dialog)
        dialog.show()
    }
}