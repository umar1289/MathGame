package com.test.mymathgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.mymathgame.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.trueAnswer.text = point.toString()
        binding.wrongAnswer.text = false_answer.toString()
        binding.returnToHome.setOnClickListener {
            activity?.onBackPressed()
        }
    }

}