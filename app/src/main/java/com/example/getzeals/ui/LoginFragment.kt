package com.example.getzeals.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.getzeals.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

open class LoginFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var loginEmail: EditText
    private lateinit var loginPass: EditText
    private lateinit var btnSignIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        loginEmail = view.findViewById(R.id.loginEmail)
        loginPass = view.findViewById(R.id.loginPass)
        btnSignIn = view.findViewById(R.id.btnLogIn)
        btnSignIn.setOnClickListener { btnLogin() }
        return view
    }

    private fun btnLogin() {
        if (loginEmail.text.isEmpty() || loginPass.text.isEmpty()) {
            Toast.makeText(requireContext(), "Enter both the fields", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment loginFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}