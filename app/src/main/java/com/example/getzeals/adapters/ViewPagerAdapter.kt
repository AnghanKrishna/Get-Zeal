package com.example.getzeals.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.getzeals.ui.AboutFragment
import com.example.getzeals.ui.PasswordFragment
import com.example.getzeals.ui.ProfileFragment

class ViewPagerAdapter(fragment: FragmentManager) : FragmentPagerAdapter(fragment) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ProfileFragment()
            1 -> PasswordFragment()
            2 -> AboutFragment()
            else -> ProfileFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "User \nProfile"
            1 -> return "Update\nPassword"
            2 -> return "About \nYou"
        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }
}