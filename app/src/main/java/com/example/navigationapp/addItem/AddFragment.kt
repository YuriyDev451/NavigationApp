package com.example.navigationapp.addItem

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.data.MyApplication
import com.example.navigationapp.databinding.FragmentAddBinding
import com.example.navigationapp.model.Colors
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AddFragment : Fragment() {


   // @Inject
    val viewModel: AddFragmentViewModel by viewModels()



    lateinit var binding: FragmentAddBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater)
        //viewModel = ViewModelProvider(this)[AddFragmentViewModel::class.java]
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

       /* viewModel.repo = (activity?.application as MyApplication).repository*/


        binding.addButton.setOnClickListener{
            if (viewModel.parseEditText()){
                val product = Colors(0,
                    viewModel.name.value.orEmpty(),
                    viewModel.count.value.orEmpty(),
                    viewModel.description.value.orEmpty()
                )

                viewModel.insert(product)
                val action = AddFragmentDirections.actionAddToShowList(product)
                findNavController().navigate(action)
            }else{
                Toast.makeText(context, "zapolnite polya", Toast.LENGTH_SHORT).show()
            }


       }
        return binding.root

    }


    fun openShowListFragment(){

    }

}