package com.example.getzeals.ui

import android.app.ActionBar
import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.getzeals.R
import com.example.getzeals.databinding.ProfileBankAccountBinding

class ProfileBankAccount : AppCompatActivity() {

    private lateinit var binding: ProfileBankAccountBinding
    private val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ProfileBankAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddAcc.setOnClickListener {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.dialog_add_bank_account)
            dialog.show()
            val window: Window = dialog.window!!
            window.setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT)
        }
    }
}