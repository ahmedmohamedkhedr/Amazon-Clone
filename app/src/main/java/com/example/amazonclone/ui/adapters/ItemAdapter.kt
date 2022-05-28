package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.BannerItemLayoutBinding
import com.example.amazonclone.databinding.ItemLayoutBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

class ItemAdapter(private val listener: AdapterListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val data: MutableList<BaseEntity> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = when (viewType) {
            EntityType.ITEM.value -> ItemViewHolder(
                ItemLayoutBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            EntityType.BANNER.value -> BannerViewHolder(
                BannerItemLayoutBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

            else -> throw IllegalArgumentException()
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ItemViewHolder -> holder.bind(data[position])
            is BannerViewHolder -> holder.bind(data[position])
        }
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int = data[position].type.value

    inner class ItemViewHolder(private val viewBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        init {
            viewBinding.root.setOnClickListener {
                listener.onClick(data[adapterPosition].id)
            }
        }

        fun bind(item: BaseEntity) = with(viewBinding) {
            title.text = item.title
            thumbnail.loadImage(item.thumbnail)
        }
    }

    inner class BannerViewHolder(private val viewBinding: BannerItemLayoutBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(item: BaseEntity) = with(viewBinding) {
            banner.loadImage(item.thumbnail)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(items: MutableList<BaseEntity>) {
        data.addAll(items)
        notifyDataSetChanged()
    }
}