package com.example.navigationapp.addItem

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentAddBinding
import com.example.navigationapp.model.Colors


class AddFragment : Fragment() {



    lateinit var viewModel: AddFragmentViewModel



    fun openShowListFragment(){
        //val action = AddFragmentDirections.actionAddToShowList()
        //findNavController().navigate(action)
    }

    lateinit var binding: FragmentAddBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater)
        viewModel = ViewModelProvider(this)[AddFragmentViewModel::class.java]
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        binding.addButton.setOnClickListener{
            openShowListFragment()
        }
        return binding.root
    }





}