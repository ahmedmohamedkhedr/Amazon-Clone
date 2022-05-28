package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.*
import com.example.amazonclone.utils.EntityWrapper
import com.example.amazonclone.utils.loadImage
import com.example.domain.enums.EntityType
import com.example.domain.models.BestOfferModel
import com.example.domain.models.CategoryModel
import com.example.domain.models.SavesCornerModel
import com.example.domain.models.TodayOfferModel
import com.example.domain.models.base.BaseEntity

class HomeFragmentRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val data: MutableList<EntityWrapper> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = when (viewType) {
            EntityType.CATEGORIES.value -> {
                CategoriesViewHolder(
                    CategoriesViewHolderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            EntityType.BEST_OFFERS.value -> {
                BestOffersViewHolder(
                    BestOffersViewHolderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            EntityType.TODAY_OFFER.value -> {
                TodayOffersViewHolder(
                    TodayOfferViewHolderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            EntityType.SAVES_CORNER.value -> {
                SavesCornerViewHolder(
                    SavesCornerViewHolderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            EntityType.ITEM.value, EntityType.BANNER.value -> {
                ItemsViewHolder(
                    ItemViewHolderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> throw IllegalArgumentException()
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CategoriesViewHolder -> holder.bind(data[position].data as MutableList<CategoryModel>)
            is BestOffersViewHolder -> holder.bind(data[position].data as MutableList<BestOfferModel>)
            is TodayOffersViewHolder -> holder.bind(data[position].data as MutableList<TodayOfferModel>)
            is SavesCornerViewHolder -> holder.bind(data[position].data as MutableList<SavesCornerModel>)
            is ItemsViewHolder -> holder.bind(data[position].data)
        }
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int = data[position].type.value

    @SuppressLint("NotifyDataSetChanged")
    fun addEntities(entities: MutableList<BaseEntity>) {
        data.add(EntityWrapper(entities))
        notifyDataSetChanged()
    }

    inner class CategoriesViewHolder(private val viewBinding: CategoriesViewHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(data: MutableList<CategoryModel>) = with(viewBinding) {
            categoriesRV.adapter = CategoriesAdapter().also { it.addCategories(data) }
        }
    }

    inner class BestOffersViewHolder(private val viewBinding: BestOffersViewHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(data: MutableList<BestOfferModel>) = with(viewBinding) {
            val banners = data.map { it.banner }.toMutableList()
            multipleImagesView.setImageUrls(banners)
            imageView.loadImage(banners.first())
            offersRV.adapter = BestOffersAdapter().also { it.addOffers(data) }
        }
    }

    inner class TodayOffersViewHolder(private val viewBinding: TodayOfferViewHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(data: MutableList<TodayOfferModel>) = with(viewBinding) {
            offersRV.adapter = TodayOffersAdapter().also { it.addOffers(data) }
        }
    }

    inner class SavesCornerViewHolder(private val viewBinding: SavesCornerViewHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(data: MutableList<SavesCornerModel>) = with(viewBinding) {
            itemsRV.adapter = SavesCornerAdapter().also { it.addItems(data) }
        }
    }

    inner class ItemsViewHolder(private val viewBinding: ItemViewHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(data: MutableList<BaseEntity>) = with(viewBinding) {
            itemsRV.adapter = ItemAdapter().also { it.addItems(data) }
        }
    }
}