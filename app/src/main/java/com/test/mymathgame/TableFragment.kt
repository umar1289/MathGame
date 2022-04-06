package com.test.mymathgame

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.test.mymathgame.databinding.FragmentLearnBinding
import com.test.mymathgame.databinding.FragmentTableBinding

var clickable = 1

class TableFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    lateinit var binding: FragmentTableBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTableBinding.inflate(LayoutInflater.from(context))

        background(1)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.btn1.setOnClickListener {
            Toast.makeText(context, "fuy", Toast.LENGTH_SHORT).show()
            clickable = 1
            background(clickable)
        }

        binding.btn2.setOnClickListener {
            clickable = 2
            background(clickable)
        }

        binding.btn3.setOnClickListener {
            clickable = 3
            background(clickable)
        }

        binding.btn4.setOnClickListener {
            clickable = 4
            background(clickable)
        }

        binding.btn5.setOnClickListener {
            clickable = 5
            background(clickable)
        }

        binding.btn6.setOnClickListener {
            clickable = 6
            background(clickable)
        }

        binding.btn7.setOnClickListener {
            clickable = 7
            background(clickable)
        }

        binding.btn8.setOnClickListener {
            clickable = 8
            background(clickable)
        }

        binding.btn9.setOnClickListener {
            clickable = 9
            background(clickable)
        }

        binding.btn10.setOnClickListener {
            clickable = 10
            background(clickable)
        }

    }

    @SuppressLint("ResourceAsColor")
    private fun background(color: Int) {
        when (color) {
            1 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            2 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            3 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            4 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            5 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            6 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            7 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            8 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            9 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#16A5FF"))
            }
            10 -> {
                binding.btn1.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn2.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn3.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn4.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn5.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn6.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn7.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn8.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn9.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
                binding.btn10.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                binding.btnTxt1.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt2.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt3.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt4.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt5.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt6.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt7.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt8.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt9.setTextColor(Color.parseColor("#16A5FF"))
                binding.btnTxt10.setTextColor(Color.parseColor("#FFFFFF"))
            }
        }
        table(color)
    }

    @SuppressLint("SetTextI18n")
    fun table(number: Int) {
        when (number) {
            1 -> {
                binding.table1.text = "1 x 1 = 1"
                binding.table2.text = "1 x 2 = 2"
                binding.table3.text = "1 x 3 = 3"
                binding.table4.text = "1 x 4 = 4"
                binding.table5.text = "1 x 5 = 5"
                binding.table6.text = "1 x 6 = 6"
                binding.table7.text = "1 x 7 = 7"
                binding.table8.text = "1 x 8 = 8"
                binding.table9.text = "1 x 9 = 9"
                binding.table10.text = "1 x 10 = 10"
            }
            2->{
                binding.table1.text = "2 x 1 = 2"
                binding.table2.text = "2 x 2 = 4"
                binding.table3.text = "2 x 3 = 6"
                binding.table4.text = "2 x 4 = 8"
                binding.table5.text = "2 x 5 = 10"
                binding.table6.text = "2 x 6 = 12"
                binding.table7.text = "2 x 7 = 14"
                binding.table8.text = "2 x 8 = 16"
                binding.table9.text = "2 x 9 = 18"
                binding.table10.text = "2 x 10 = 20"
            }
            3->{
                binding.table1.text = "3 x 1 = 3"
                binding.table2.text = "3 x 2 = 6"
                binding.table3.text = "3 x 3 = 9"
                binding.table4.text = "3 x 4 = 12"
                binding.table5.text = "3 x 5 = 15"
                binding.table6.text = "3 x 6 = 18"
                binding.table7.text = "3 x 7 = 21"
                binding.table8.text = "3 x 8 = 24"
                binding.table9.text = "3 x 9 = 27"
                binding.table10.text = "3 x 10 = 30"
            }
            4->{
                binding.table1.text = "4 x 1 = 4"
                binding.table2.text = "4 x 2 = 8"
                binding.table3.text = "4 x 3 = 12"
                binding.table4.text = "4 x 4 = 46"
                binding.table5.text = "4 x 5 = 20"
                binding.table6.text = "4 x 6 = 24"
                binding.table7.text = "4 x 7 = 28"
                binding.table8.text = "4 x 8 = 32"
                binding.table9.text = "4 x 9 = 36"
                binding.table10.text = "4 x 10 = 40"
            }
            5->{
                binding.table1.text = "5 x 1 = 5"
                binding.table2.text = "5 x 2 = 10"
                binding.table3.text = "5 x 3 = 15"
                binding.table4.text = "5 x 4 = 20"
                binding.table5.text = "5 x 5 = 25"
                binding.table6.text = "5 x 6 = 30"
                binding.table7.text = "5 x 7 = 35"
                binding.table8.text = "5 x 8 = 40"
                binding.table9.text = "5 x 9 = 45"
                binding.table10.text = "5 x 10 = 50"
            }
            6->{
                binding.table1.text = "6 x 1 = 6"
                binding.table2.text = "6 x 2 = 12"
                binding.table3.text = "6 x 3 = 18"
                binding.table4.text = "6 x 4 = 24"
                binding.table5.text = "6 x 5 = 20"
                binding.table6.text = "6 x 6 = 36"
                binding.table7.text = "6 x 7 = 42"
                binding.table8.text = "6 x 8 = 48"
                binding.table9.text = "6 x 9 = 54"
                binding.table10.text = "6 x 10 = 60"
            }
            7->{
                binding.table1.text = "7 x 1 = 7"
                binding.table2.text = "7 x 2 = 14"
                binding.table3.text = "7 x 3 = 21"
                binding.table4.text = "7 x 4 = 28"
                binding.table5.text = "7 x 5 = 35"
                binding.table6.text = "7 x 6 = 42"
                binding.table7.text = "7 x 7 = 49"
                binding.table8.text = "7 x 8 = 56"
                binding.table9.text = "7 x 9 = 63"
                binding.table10.text = "7 x 10 = 70"
            }
            8->{
                binding.table1.text = "8 x 1 = 8"
                binding.table2.text = "8 x 2 = 16"
                binding.table3.text = "8 x 3 = 24"
                binding.table4.text = "8 x 4 = 32"
                binding.table5.text = "8 x 5 = 40"
                binding.table6.text = "8 x 6 = 48"
                binding.table7.text = "8 x 7 = 56"
                binding.table8.text = "8 x 8 = 64"
                binding.table9.text = "8 x 9 = 72"
                binding.table10.text = "8 x 10 = 80"
            }
            9->{
                binding.table1.text = "9 x 1 = 9"
                binding.table2.text = "9 x 2 = 18"
                binding.table3.text = "9 x 3 = 27"
                binding.table4.text = "9 x 4 = 36"
                binding.table5.text = "9 x 5 = 45"
                binding.table6.text = "9 x 6 = 54"
                binding.table7.text = "9 x 7 = 63"
                binding.table8.text = "9 x 8 = 72"
                binding.table9.text = "9 x 9 = 81"
                binding.table10.text = "9 x 10 = 90"
            }
            10->{
                binding.table1.text = "10 x 1 = 10"
                binding.table2.text = "10 x 2 = 20"
                binding.table3.text = "10 x 3 = 30"
                binding.table4.text = "10 x 4 = 40"
                binding.table5.text = "10 x 5 = 50"
                binding.table6.text = "10 x 6 = 60"
                binding.table7.text = "10 x 7 = 70"
                binding.table8.text = "10 x 8 = 80"
                binding.table9.text = "10 x 9 = 90"
                binding.table10.text = "10 x 10 = 100"
            }
        }
    }
}