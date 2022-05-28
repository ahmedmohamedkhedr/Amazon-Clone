package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.BuyMoreItemBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.BuyMoreModel

class BuyMoreAdapter : RecyclerView.Adapter<BuyMoreAdapter.ViewHolder>() {
    private val data: MutableList<BuyMoreModel.Product> = mutableListOf()

    inner class ViewHolder(private val viewBinding: BuyMoreItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(item: BuyMoreModel.Product) = with(viewBinding) {
            name.text = item.name
            thumbnail.loadImage(item.thumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            BuyMoreItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(data:MutableList<BuyMoreModel.Product>){
        this.data.addAll(data)
        notifyDataSetChanged()
    }
}