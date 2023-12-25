package com.example.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentShowListBinding


class ShowListFragment : Fragment() {

    /*fun openAddFragment(){
        val action = HomeFragmentDirections.actionHomeToAdd()
        findNavController().navigate(action)
    }*/

    lateinit var binding: FragmentShowListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowListBinding.inflate(inflater)


        return binding.root


    }


}