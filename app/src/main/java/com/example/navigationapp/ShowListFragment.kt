package com.example.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.adapter.ListAdapter
import com.example.navigationapp.databinding.FragmentShowListBinding


class ShowListFragment : Fragment() {

    /*fun openAddFragment(){
        val action = HomeFragmentDirections.actionHomeToAdd()
        findNavController().navigate(action)
    }*/

    lateinit var binding: FragmentShowListBinding

    lateinit var viewModel: ShowListViewModel

    lateinit var adapter : ListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowListBinding.inflate(inflater)
        viewModel=ViewModelProvider(this)[ShowListViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        val args: ShowListFragmentArgs by navArgs()

        val receivedData = args.colors
        viewModel.receivedData.value = receivedData

        adapter = ListAdapter (requireContext(), mutableListOf(), onClick = {
            println("Clicked:  Name = ${it.name}, Code = ${it.count}, Description = ${it.description}")
//            viewModel.receivedData.observe(viewLifecycleOwner){
//
//            }

        })

        binding.productListView.adapter = adapter


        return binding.root


    }

  /*  fun receiveData (){
        val args: ShowListFragmentArgs by navArgs()

        val receivedData = args.name
        viewModel.receivedData.value = receivedData

    }*/



}