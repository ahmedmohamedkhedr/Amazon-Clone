package com.example.amazonclone.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.amazonclone.databinding.FragmentHomeBinding
import com.example.amazonclone.ui.adapters.HomeFragmentRecyclerAdapter
import com.example.domain.models.base.BaseEntity
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private lateinit var ui: FragmentHomeBinding
    private val viewModel by viewModel<HomeViewModel>()
    private val adapter: HomeFragmentRecyclerAdapter by lazy {
        HomeFragmentRecyclerAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ui = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()))
        return ui.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView()
        setupRecyclerView()
        viewModel.getData()
    }

    private fun setupRecyclerView() {
        ui.homeRecyclerView.adapter = adapter
    }

    private fun bindView() {
        viewModel._categoriesLiveData.observe(viewLifecycleOwner) {
           adapter.addEntities(it as MutableList<BaseEntity>)
        }
        viewModel._bestOffersLiveData.observe(viewLifecycleOwner) {
           adapter.addEntities(it as MutableList<BaseEntity>)
        }
        viewModel._buyMoreLiveDate.observe(viewLifecycleOwner) {

        }
        viewModel._exploreMoreLiveDate.observe(viewLifecycleOwner) {

        }
        viewModel._itemsLiveDate.observe(viewLifecycleOwner) {

        }
        viewModel._savesCornerLiveDate.observe(viewLifecycleOwner) {

        }
        viewModel._todayOffersLiveDate.observe(viewLifecycleOwner) {

        }

    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}