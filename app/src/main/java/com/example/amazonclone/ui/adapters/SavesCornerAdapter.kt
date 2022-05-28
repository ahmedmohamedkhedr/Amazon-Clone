package com.example.amazonclone.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonclone.databinding.SavesCornerItemLayoutBinding
import com.example.amazonclone.utils.loadImage
import com.example.domain.models.SavesCornerModel

class SavesCornerAdapter : RecyclerView.Adapter<SavesCornerAdapter.ViewHolder>() {
    private val data = mutableListOf<SavesCornerModel>()

    inner class ViewHolder(private val viewBinding: SavesCornerItemLayoutBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(item: SavesCornerModel) = with(viewBinding) {
            title.text = item.title
            thumbnail.loadImage(item.thumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            SavesCornerItemLayoutBinding.inflate(
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
    fun addItems(items: MutableList<SavesCornerModel>) {
        data.addAll(items)
        notifyDataSetChanged()
    }
}