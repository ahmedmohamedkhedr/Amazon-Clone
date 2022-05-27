package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.BestOfferItemLayoutBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.BestOfferModel

class BestOffersAdapter : RecyclerView.Adapter<BestOffersAdapter.ViewHolder>() {
    private val data = mutableListOf<BestOfferModel>()

    inner class ViewHolder(private val viewBinding: BestOfferItemLayoutBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(item: BestOfferModel) = with(viewBinding) {
            title.text = item.title
            thumbnail.loadImage(item.thumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            BestOfferItemLayoutBinding.inflate(
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
    fun addOffers(offers: MutableList<BestOfferModel>) {
        data.addAll(offers)
        notifyDataSetChanged()
    }
}