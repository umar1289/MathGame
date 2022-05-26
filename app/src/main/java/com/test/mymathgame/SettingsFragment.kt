package com.test.mymathgame

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.test.mymathgame.databinding.FragmentSettingsBinding

var operation = 0

class SettingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    override fun onResume() {
        super.onResume()
        onClick(operation)

        binding.multiply.setOnClickListener {
            operation = 0
            onClick(operation)
        }

        binding.division.setOnClickListener {
            operation = 1
            onClick(operation)
        }
        binding.save.setOnClickListener {
            fromNumbersRangeTextA = binding.fromNumbersRangeA.text.toString().toInt()
            toNumbersRangeTextA = binding.toNumbersRangeA.text.toString().toInt()
            fromNumbersRangeTextB = binding.fromNumbersRangeB.text.toString().toInt()
            toNumbersRangeTextB = binding.toNumbersRangeB.text.toString().toInt()
            findNavController().popBackStack()
        }
        binding.fromNumbersRangeA.setText(fromNumbersRangeTextA.toString())
        binding.toNumbersRangeA.setText(toNumbersRangeTextA.toString())
        binding.fromNumbersRangeB.setText(fromNumbersRangeTextB.toString())
        binding.toNumbersRangeB.setText(toNumbersRangeTextB.toString())
    }

    private fun onClick(color: Int) {
        when (color) {
            0 -> {
                binding.multiplyColor.setBackgroundColor(Color.parseColor("#16A5FF"))
                binding.divisionColor.setBackgroundColor(Color.parseColor("#C3C2C2"))
            }
            1 -> {
                binding.divisionColor.setBackgroundColor(Color.parseColor("#16A5FF"))
                binding.multiplyColor.setBackgroundColor(Color.parseColor("#C3C2C2"))
            }
        }
    }
}