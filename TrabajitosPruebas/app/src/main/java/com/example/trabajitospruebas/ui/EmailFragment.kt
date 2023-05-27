package com.example.trabajitospruebas.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.trabajitospruebas.R
import com.example.trabajitospruebas.databinding.FragmentEmailBinding


class EmailFragment : Fragment() {


  private lateinit var binding : FragmentEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.action_emailFragment_to_loginFragment)
        }

        binding.confirmButton.setOnClickListener {
            findNavController().navigate(R.id.action_emailFragment_to_verificationFragment)
        }
    }



}