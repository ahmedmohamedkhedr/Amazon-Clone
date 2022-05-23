package com.example.amazonclone.ui.adapters

import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    lifeCycle: Lifecycle,
    fm: FragmentManager,
    val pages: MutableList<PageModel>
) : FragmentStateAdapter(fm, lifeCycle) {

    override fun getItemCount(): Int = pages.size

    override fun createFragment(position: Int): Fragment = pages[position].fragment

    data class PageModel(val fragment: Fragment, @DrawableRes val icon: Int)
}