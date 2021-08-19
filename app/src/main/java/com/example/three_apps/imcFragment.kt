package com.example.three_apps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.three_apps.databinding.FragmentImcBinding

class imcFragment : Fragment() {

    private var binding: FragmentImcBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        saveddInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentImcBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.tvResultado?.isVisible = false

        binding?.btCalcular?.setOnClickListener {

            val altura = binding?.etAltura?.text.toString().toDouble() / 100
                val peso = binding?.etPeso?.text.toString().toDouble()
                val altura2 = altura * altura
                val imc = peso / altura2
                binding?.tvResultado?.text = imc.format(2).toString()

                val resultadoObesidade = when {
                    imc < 10 -> "Desnutrição Grau V"
                    imc in 10.0..12.99 -> "Desnutrição Grau IV"
                    imc in 13.0..15.99 -> "Desnutrição Grau III"
                    imc in 16.0..16.99 -> "Desnutrição Grau II"
                    imc in 17.0..18.49 -> "Desnutrição Grau I"
                    imc in 18.5..24.99 -> "Normal"
                    imc in 25.0..29.99 -> "Pré-obesidade"
                    imc in 30.0..34.59 -> "Obesidade Grau I"
                    imc in 34.6..39.99 -> "Obesidade Grau II"
                    imc >= 40 -> "Obesidade Grau III"
                    else -> ""
                }

            binding?.tvResultado?.isVisible = true
            binding?.tvObesidade?.text = resultadoObesidade


            }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun Double.format(digits: Int) = "%.${digits}f".format(this)
}





