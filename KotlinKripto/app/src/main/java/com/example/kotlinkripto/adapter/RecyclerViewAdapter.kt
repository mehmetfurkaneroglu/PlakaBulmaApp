package com.example.kotlinkripto.adapter

import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinkripto.R
import com.example.kotlinkripto.databinding.ActivityMainBinding
import com.example.kotlinkripto.databinding.RowLayoutBinding
import com.example.kotlinkripto.model.CryptoModel

class RecyclerViewAdapter(private val cryrptoList: ArrayList<CryptoModel>,private val listener: Listener): RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener {
        fun onItemClick(cryptoModel: CryptoModel)
    }

    lateinit var binding: RowLayoutBinding

    class RowHolder(private val itemBinding: RowLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(cryptoModel: CryptoModel) {
            itemBinding.textName.text = cryptoModel.currency
            itemBinding.textPrice.text = cryptoModel.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val itemBinding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RowHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return cryrptoList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryrptoList[position])
    }
}