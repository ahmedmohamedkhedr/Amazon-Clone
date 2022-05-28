package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.BuyMoreItemBinding
import com.example.amazonclone.databinding.ExploreMoreItemBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.BuyMoreModel

class ExploreMoreAdapter(private val listener: AdapterListener) :
    RecyclerView.Adapter<ExploreMoreAdapter.ViewHolder>() {
    private val data: MutableList<String> = mutableListOf()

    inner class ViewHolder(private val viewBinding: ExploreMoreItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        init {
            viewBinding.root.setOnClickListener {
                listener.onClick("")
            }
        }

        fun bind(item: String) = with(viewBinding) {
            thumbnail.loadImage(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ExploreMoreItemBinding.inflate(
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
    fun addItems(data: MutableList<String>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }
}