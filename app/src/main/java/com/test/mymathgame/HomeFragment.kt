package com.test.mymathgame

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.test.mymathgame.databinding.FragmentHomeBinding

var difficulty:Int = 0
class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        binding.learn.setOnClickListener{
            findNavController().navigate(R.id.learnFragment)
        }

        binding.test.setOnClickListener{
            findNavController().navigate(R.id.playFragment)
        }

        binding.settings.setOnClickListener {
            findNavController().navigate(R.id.settingsFragment)
        }

        binding.share.setOnClickListener {
            val shareBody = "Muslim Developer"
            val shareSub = "Math game"

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub)
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)

            startActivity(shareIntent)
        }

        binding.table.setOnClickListener {
            findNavController().navigate(R.id.tableFragment)
        }
    }
}