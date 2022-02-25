package com.example.getzeals

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [signupFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
open class SignupFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var signup_fullnm: EditText
    private lateinit var signup_email: EditText
    private lateinit var signup_pass: EditText
    private lateinit var btnsignup: Button

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
        val view: View = inflater.inflate(R.layout.fragment_signup, container, false)
        signup_fullnm = view.findViewById(R.id.signup_fullnm)
        signup_email = view.findViewById(R.id.signup_email)
        signup_pass = view.findViewById(R.id.signup_pass)
        btnsignup = view.findViewById(R.id.btnsignup)
        btnsignup.setOnClickListener { btnsignup() }
        return view
    }

    private fun btnsignup() {
        if (signup_fullnm.text.isEmpty() || signup_email.text.isEmpty() || signup_pass.text.isEmpty()) {
            Toast.makeText(requireContext(), "Enter all the fields", Toast.LENGTH_SHORT).show()
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
         * @return A new instance of fragment signupFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SignupFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}