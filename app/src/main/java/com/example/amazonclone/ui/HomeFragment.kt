package com.example.amazonclone.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.amazonclone.R
import com.example.amazonclone.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var ui: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ui = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()))
        return ui.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}