package com.example.amazonclone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.example.amazonclone.R
import com.example.amazonclone.databinding.ActivityMainBinding
import com.example.amazonclone.ui.adapters.ViewPagerAdapter
import com.example.amazonclone.ui.home.HomeFragment
import com.example.amazonclone.utils.setStatusBarColor
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var ui: ActivityMainBinding
    private val pagerAdapter: ViewPagerAdapter by lazy {
        ViewPagerAdapter(
            lifecycle,
            supportFragmentManager,
            mutableListOf(
                ViewPagerAdapter.PageModel(
                    fragment = HomeFragment.newInstance(),
                    icon = R.drawable.ic_home
                ),
                ViewPagerAdapter.PageModel(
                    fragment = HomeFragment.newInstance(),
                    icon = R.drawable.ic_profile
                ),
                ViewPagerAdapter.PageModel(
                    fragment = HomeFragment.newInstance(),
                    icon = R.drawable.ic_cart
                ),
                ViewPagerAdapter.PageModel(
                    fragment = HomeFragment.newInstance(),
                    icon = R.drawable.ic_menu
                )
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        setStatusBarColor(this, R.color.teal_200, true)
        setupViewPagerWithTabLayout()
    }

    private fun setupViewPagerWithTabLayout() {
        with(ui.viewPager) {
            isUserInputEnabled = false
            adapter = pagerAdapter
        }

        TabLayoutMediator(ui.tabLayout, ui.viewPager) { tab, position ->
            tab.icon = ContextCompat.getDrawable(this, pagerAdapter.pages[position].icon)
        }.attach()
    }
}