package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.R
import com.example.amazonclone.databinding.BestOfferItemLayoutBinding
import com.example.amazonclone.databinding.TodayOfferItemLayoutBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.BestOfferModel
import com.example.domain.models.TodayOfferModel

class TodayOffersAdapter : RecyclerView.Adapter<TodayOffersAdapter.ViewHolder>() {
    private val data = mutableListOf<TodayOfferModel>()

    inner class ViewHolder(private val viewBinding: TodayOfferItemLayoutBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: TodayOfferModel) = with(viewBinding) {
            title.text = item.title
            salePrice.text = "${item.salePrice} ${root.context.getString(R.string.egp)}"
            saleTextView.text = "${root.context.getString(R.string.discount_to)} ${item.sale} %"
            thumbnail.loadImage(item.thumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            TodayOfferItemLayoutBinding.inflate(
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
    fun addOffers(offers: MutableList<TodayOfferModel>) {
        data.addAll(offers)
        notifyDataSetChanged()
    }
}