package com.example.three_apps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.three_apps.databinding.FragmentPerfilBinding


class perfilFragment : Fragment() {

    private var binding: FragmentPerfilBinding? =  null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPerfilBinding.inflate(inflater , container , false)
      return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}