package com.example.amazonclone.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.enums.EntityType
import com.example.domain.models.base.BaseEntity

class HomeFragmentRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val dataSet: MutableList<BaseEntity> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int =
        EntityType.valueOf(dataSet[position].type.name).value

    override fun getItemCount(): Int = dataSet.size
}