package com.example.getzeals.ui

import android.app.ActionBar
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.*
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.getzeals.R
import com.example.getzeals.databinding.ProfileAccountBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class ProfileAccount : AppCompatActivity() {

    private lateinit var binding: ProfileAccountBinding
    private val context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ProfileAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llHeader.setOnClickListener {
            val back = Intent(this, SidebarProfileActivity::class.java)
            startActivity(back)
        }

        binding.ivLinkBank.setOnClickListener {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.dialog_link_bank)
            val btnAddUpdate = dialog.findViewById<View>(R.id.btnAddUpdate) as Button
            val btnCancel = dialog.findViewById<View>(R.id.btnCancel) as Button
            val privacyPolicy = dialog.findViewById<View>(R.id.llPrivacyPolicy) as LinearLayout
            dialog.show()
            btnCancel.setOnClickListener {
                privacyPolicy.visibility = GONE
            }
            btnAddUpdate.setOnClickListener {
                privacyPolicy.visibility = VISIBLE
            }
            val window: Window = dialog.window!!
            window.setLayout(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.WRAP_CONTENT
            )
        }

        binding.tvViewTransaction.setOnClickListener {
            binding.cvViewTran.visibility = VISIBLE
        }

        binding.tvBankTransfer.setOnClickListener {
            showBottomSheetDialog()
        }

    }

    //    add style and theme for rounded corners
    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(R.layout.bank_tranfer_process)
        bottomSheetDialog.show()
    }
}