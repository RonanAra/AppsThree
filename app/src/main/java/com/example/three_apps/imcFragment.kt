package com.example.three_apps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.three_apps.databinding.FragmentImcBinding


class imcFragment : Fragment() {

    private var binding: FragmentImcBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentImcBinding.inflate(inflater,container,false)
        return binding?.root
    }

}