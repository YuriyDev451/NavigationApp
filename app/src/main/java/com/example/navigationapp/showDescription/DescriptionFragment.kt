package com.example.navigationapp.showDescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.databinding.FragmentDescriptionBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DescriptionFragment : Fragment() {


    lateinit var binding: FragmentDescriptionBinding
    val args: DescriptionFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater)

        val description = args.description
        binding.tvDescription.text = description
        return binding.root
    }


}