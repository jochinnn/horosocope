package com.example.oroscoapp.ui.home.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oroscoapp.R
import com.example.oroscoapp.databinding.FragmentHorocopeBinding


class HorocopeFragment : Fragment() {

    private var _binding: FragmentHorocopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHorocopeBinding.inflate(layoutInflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }


}