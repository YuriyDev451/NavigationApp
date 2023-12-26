package com.example.navigationapp.showList

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

    private lateinit var listAdapter : ListAdapter
    val args: ShowListFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShowListBinding.inflate(inflater)
        viewModel=ViewModelProvider(this)[ShowListViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel


        listAdapter = ListAdapter (requireContext(), mutableListOf(), onClick = {
            val action = ShowListFragmentDirections.actionShowToDescription(it.description)
            findNavController().navigate(action)
        })
        binding.productListView.adapter = listAdapter
        val receivedData = args.colors

        listAdapter.addNewItem(receivedData)

        return binding.root


    }





  /*  fun receiveData (){
        val args: ShowListFragmentArgs by navArgs()

        val receivedData = args.name
        viewModel.receivedData.value = receivedData

    }*/



}