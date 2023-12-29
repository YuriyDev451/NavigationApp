package com.example.navigationapp.showList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.adapter.ListAdapter
import com.example.navigationapp.data.MyApplication
import com.example.navigationapp.databinding.FragmentShowListBinding
import com.example.navigationapp.model.Colors
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ShowListFragment : Fragment() {

    /*fun openAddFragment(){
        val action = HomeFragmentDirections.actionHomeToAdd()
        findNavController().navigate(action)
    }*/

    lateinit var binding: FragmentShowListBinding


    //@Inject
     val viewModel: ShowListViewModel by viewModels()

    private lateinit var listAdapter : ListAdapter
    val args: ShowListFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowListBinding.inflate(inflater)
       // viewModel=ViewModelProvider(this)[ShowListViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        //viewModel.repository = (activity?.application as MyApplication).repository

        listAdapter = ListAdapter (requireContext(), mutableListOf(), onClick = {
            val action = ShowListFragmentDirections.actionShowToDescription(it.description)
            findNavController().navigate(action)
        })
        binding.productListView.adapter = listAdapter
//        val receivedData = args.colors

        viewModel.getAll().observe(viewLifecycleOwner, Observer { productList ->
            // Adaptöre yeni ürünler eklemek ve listeyi güncellemek
            listAdapter.addNewItem(productList)
        })

        return binding.root


    }





  /*  fun receiveData (){
        val args: ShowListFragmentArgs by navArgs()

        val receivedData = args.name
        viewModel.receivedData.value = receivedData

    }*/



}