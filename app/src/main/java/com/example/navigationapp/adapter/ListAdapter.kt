package com.example.navigationapp.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.example.navigationapp.R
import com.example.navigationapp.databinding.ListItemBinding
import com.example.navigationapp.model.Colors

class ListAdapter(val context: Context, private var productList: MutableList<Colors>, var onClick: (Colors) -> Unit) : BaseAdapter(){


        fun addNewItem(newData: Colors) {
            productList.add(newData)
            notifyDataSetChanged()
        }
        override fun getCount(): Int {
            return productList.count()
        }

        override fun getItem(position: Int): Any {
            return productList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var newConvertView = convertView

            var holder : ViewHolder

            if (convertView == null) {
                val binding: ListItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(context),
                    R.layout.list_item,
                    parent,
                    false
                )


                newConvertView = binding.root
                holder = ViewHolder(binding, onClick)
                holder.bind(productList[position])

                newConvertView?.tag = holder

                return binding.root

            } else {
                holder = convertView.tag as ViewHolder
                holder.bind(productList[position])
            }

            return newConvertView!!
        }

        private class ViewHolder(var binding: ListItemBinding, var onClick: (Colors) -> Unit) {
            fun bind(color: Colors){

                binding.textView.text = color.name
                binding.textView2.text = color.count


                binding.product = color

                binding.root.setOnClickListener {
                    onClick(binding.product as Colors)


                }
            }
        }

    }
