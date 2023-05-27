package com.example.trabajitospruebas.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.trabajitospruebas.R
import com.example.trabajitospruebas.databinding.FragmentNewPasswordBinding


class New_Password_Fragment : Fragment() {

   private lateinit var binding : FragmentNewPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_new_Password_Fragment_to_emailFragment)
        }

        binding.updateButton.setOnClickListener {
            findNavController().navigate(R.id.action_new_Password_Fragment_to_passwordChangedFragment)
        }
    }

}