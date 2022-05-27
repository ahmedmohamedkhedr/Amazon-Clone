package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.CategoriesItemLayoutBinding
import com.example.amazonclone.utils.loadCircularImage
import com.example.domain.models.CategoryModel

class CategoriesAdapter : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {
    private val dataSet = mutableListOf<CategoryModel>()

    inner class ViewHolder(val itemViewBinding: CategoriesItemLayoutBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {

        fun bind(item: CategoryModel) = with(itemViewBinding) {
            categoryImage.loadCircularImage(item.thumbnail)
            categoryName.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CategoriesItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    @SuppressLint("NotifyDataSetChanged")
    fun addCategories(categories: MutableList<CategoryModel>) {
        dataSet.addAll(categories)
        notifyDataSetChanged()
    }
}