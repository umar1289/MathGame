package com.test.mymathgame

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.mymathgame.databinding.FragmentLearnBinding
import kotlinx.android.synthetic.main.custom_dialog.view.*
import java.util.*

class LearnFragment : Fragment() {
    var number1 = 0
    var number2 = 0
    var trueAnswer = 0
    var answer = 0
    var point = 0
    var falseAnswer1 = 0
    var falseAnswer2 = 0
    var falseAnswer3 = 0
    var task = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    lateinit var binding: FragmentLearnBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLearnBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onResume() {
        super.onResume()
        random()
        showCarrots()
        binding.card1.setOnClickListener {
            if (binding.txt1.text.toString().toInt() == trueAnswer) {
                point++
                random()
                showCarrots()
            } else {
                random()
                showCarrots()
            }
            if (task == 10) {
                showDialog()
                findNavController().navigate(R.id.homeFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card2.setOnClickListener {
            if (binding.txt2.text.toString().toInt() == trueAnswer) {
                point++
                random()
                showCarrots()
            } else {
                random()
                showCarrots()
            }
            if (task == 10) {
                showDialog()
                findNavController().navigate(R.id.homeFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card3.setOnClickListener {
            if (binding.txt3.text.toString().toInt() == trueAnswer) {
                point++
                random()
                showCarrots()
            } else {
                random()
                showCarrots()
            }
            if (task == 10) {
                showDialog()
                findNavController().navigate(R.id.homeFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card4.setOnClickListener {
            if (binding.txt4.text.toString().toInt() == trueAnswer) {
                point++
                random()
                showCarrots()
            } else {
                random()
                showCarrots()
            }
            if (task == 10) {
                showDialog()
                findNavController().navigate(R.id.homeFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }
    }

    private fun random() {
        number1 = rand(fromNumbersRangeTextA, toNumbersRangeTextA)
        number2 = rand(fromNumbersRangeTextB, toNumbersRangeTextB)
        answer = Random().nextInt(4)
        showDisplay()
        showAnswer()
    }

    @SuppressLint("SetTextI18n")
    private fun showDisplay() {
        if (number1 != 0 && number2 != 0 && number1 != 1 && number2 != 1) {
            if (operation == 0) {
                binding.number.text = "$number1 * $number2 = "
                trueAnswer = number1 * number2
                falseAnswer1 = trueAnswer + 2
                falseAnswer2 = trueAnswer - 2
                falseAnswer3 = trueAnswer + 5
            } else if (operation == 1) {
                if (number1 % number2 == 0 && number1 != number2) {
                    binding.number.text = "$number1 : $number2"
                    trueAnswer = number1 / number2
                    falseAnswer1 = trueAnswer + 2
                    falseAnswer2 = trueAnswer + 3
                    falseAnswer3 = trueAnswer + 5
                } else random()
            }
        } else random()
    }

    private fun showAnswer() {
        when (answer) {
            0 -> {
                binding.txt1.text = trueAnswer.toString()
                binding.txt2.text = falseAnswer1.toString()
                binding.txt3.text = falseAnswer2.toString()
                binding.txt4.text = falseAnswer3.toString()
            }
            1 -> {
                binding.txt1.text = falseAnswer1.toString()
                binding.txt2.text = trueAnswer.toString()
                binding.txt3.text = falseAnswer2.toString()
                binding.txt4.text = falseAnswer3.toString()
            }
            2 -> {
                binding.txt1.text = falseAnswer2.toString()
                binding.txt2.text = falseAnswer1.toString()
                binding.txt3.text = trueAnswer.toString()
                binding.txt4.text = falseAnswer3.toString()
            }
            3 -> {
                binding.txt1.text = falseAnswer3.toString()
                binding.txt2.text = falseAnswer1.toString()
                binding.txt3.text = falseAnswer2.toString()
                binding.txt4.text = trueAnswer.toString()
            }
        }
    }

    private fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }

    @SuppressLint("SetTextI18n")
    private fun showDialog() {
        val alertDialog = AlertDialog.Builder(context)
        val dialog = alertDialog.create()

        val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null, false)
        dialog.setView(dialogView)

        dialogView.tasks.text = "Tasks: $task"
        dialogView.answers.text = "True: $point"

        dialogView.btn.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun showCarrots() {
        if (number2 in 2..9) {
            binding.example.visibility = View.VISIBLE
            binding.txtWarning.visibility = View.INVISIBLE
            when (number1) {
                1 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.INVISIBLE
                    binding.carrot3.visibility = View.INVISIBLE
                    binding.carrot4.visibility = View.INVISIBLE
                    binding.carrot5.visibility = View.INVISIBLE
                    binding.carrot6.visibility = View.INVISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                2 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.INVISIBLE
                    binding.carrot4.visibility = View.INVISIBLE
                    binding.carrot5.visibility = View.INVISIBLE
                    binding.carrot6.visibility = View.INVISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                3 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.INVISIBLE
                    binding.carrot5.visibility = View.INVISIBLE
                    binding.carrot6.visibility = View.INVISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                4 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.INVISIBLE
                    binding.carrot6.visibility = View.INVISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                5 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.INVISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                6 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.VISIBLE
                    binding.carrot7.visibility = View.INVISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                            binding.carrot6.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                            binding.carrot6.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                            binding.carrot6.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                            binding.carrot6.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                            binding.carrot6.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                            binding.carrot6.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                            binding.carrot6.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                            binding.carrot6.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                            binding.carrot6.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                7 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.VISIBLE
                    binding.carrot7.visibility = View.VISIBLE
                    binding.carrot8.visibility = View.INVISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                            binding.carrot6.setImageResource(R.drawable.carrot_1)
                            binding.carrot7.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                            binding.carrot6.setImageResource(R.drawable.carrot_2)
                            binding.carrot7.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                            binding.carrot6.setImageResource(R.drawable.carrot_3)
                            binding.carrot7.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                            binding.carrot6.setImageResource(R.drawable.carrot_4)
                            binding.carrot7.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                            binding.carrot6.setImageResource(R.drawable.carrot_5)
                            binding.carrot7.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                            binding.carrot6.setImageResource(R.drawable.carrot_6)
                            binding.carrot7.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                            binding.carrot6.setImageResource(R.drawable.carrot_7)
                            binding.carrot7.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                            binding.carrot6.setImageResource(R.drawable.carrot_8)
                            binding.carrot7.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                            binding.carrot6.setImageResource(R.drawable.carrot_9)
                            binding.carrot7.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                8 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.VISIBLE
                    binding.carrot7.visibility = View.VISIBLE
                    binding.carrot8.visibility = View.VISIBLE
                    binding.carrot9.visibility = View.INVISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                            binding.carrot6.setImageResource(R.drawable.carrot_1)
                            binding.carrot7.setImageResource(R.drawable.carrot_1)
                            binding.carrot8.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                            binding.carrot6.setImageResource(R.drawable.carrot_2)
                            binding.carrot7.setImageResource(R.drawable.carrot_2)
                            binding.carrot8.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                            binding.carrot6.setImageResource(R.drawable.carrot_3)
                            binding.carrot7.setImageResource(R.drawable.carrot_3)
                            binding.carrot8.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                            binding.carrot6.setImageResource(R.drawable.carrot_4)
                            binding.carrot7.setImageResource(R.drawable.carrot_4)
                            binding.carrot8.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                            binding.carrot6.setImageResource(R.drawable.carrot_5)
                            binding.carrot7.setImageResource(R.drawable.carrot_5)
                            binding.carrot8.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                            binding.carrot6.setImageResource(R.drawable.carrot_6)
                            binding.carrot7.setImageResource(R.drawable.carrot_6)
                            binding.carrot8.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                            binding.carrot6.setImageResource(R.drawable.carrot_7)
                            binding.carrot7.setImageResource(R.drawable.carrot_7)
                            binding.carrot8.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                            binding.carrot6.setImageResource(R.drawable.carrot_8)
                            binding.carrot7.setImageResource(R.drawable.carrot_8)
                            binding.carrot8.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                            binding.carrot6.setImageResource(R.drawable.carrot_9)
                            binding.carrot7.setImageResource(R.drawable.carrot_9)
                            binding.carrot8.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                9 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.VISIBLE
                    binding.carrot7.visibility = View.VISIBLE
                    binding.carrot8.visibility = View.VISIBLE
                    binding.carrot9.visibility = View.VISIBLE
                    binding.carrot10.visibility = View.INVISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                            binding.carrot6.setImageResource(R.drawable.carrot_1)
                            binding.carrot7.setImageResource(R.drawable.carrot_1)
                            binding.carrot8.setImageResource(R.drawable.carrot_1)
                            binding.carrot9.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                            binding.carrot6.setImageResource(R.drawable.carrot_2)
                            binding.carrot7.setImageResource(R.drawable.carrot_2)
                            binding.carrot8.setImageResource(R.drawable.carrot_2)
                            binding.carrot9.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                            binding.carrot6.setImageResource(R.drawable.carrot_3)
                            binding.carrot7.setImageResource(R.drawable.carrot_3)
                            binding.carrot8.setImageResource(R.drawable.carrot_3)
                            binding.carrot9.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                            binding.carrot6.setImageResource(R.drawable.carrot_4)
                            binding.carrot7.setImageResource(R.drawable.carrot_4)
                            binding.carrot8.setImageResource(R.drawable.carrot_4)
                            binding.carrot9.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                            binding.carrot6.setImageResource(R.drawable.carrot_5)
                            binding.carrot7.setImageResource(R.drawable.carrot_5)
                            binding.carrot8.setImageResource(R.drawable.carrot_5)
                            binding.carrot9.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                            binding.carrot6.setImageResource(R.drawable.carrot_6)
                            binding.carrot7.setImageResource(R.drawable.carrot_6)
                            binding.carrot8.setImageResource(R.drawable.carrot_6)
                            binding.carrot9.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                            binding.carrot6.setImageResource(R.drawable.carrot_7)
                            binding.carrot7.setImageResource(R.drawable.carrot_7)
                            binding.carrot8.setImageResource(R.drawable.carrot_7)
                            binding.carrot9.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                            binding.carrot6.setImageResource(R.drawable.carrot_8)
                            binding.carrot7.setImageResource(R.drawable.carrot_8)
                            binding.carrot8.setImageResource(R.drawable.carrot_8)
                            binding.carrot9.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                            binding.carrot6.setImageResource(R.drawable.carrot_9)
                            binding.carrot7.setImageResource(R.drawable.carrot_9)
                            binding.carrot8.setImageResource(R.drawable.carrot_9)
                            binding.carrot9.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
                10 -> {
                    binding.carrot1.visibility = View.VISIBLE
                    binding.carrot2.visibility = View.VISIBLE
                    binding.carrot3.visibility = View.VISIBLE
                    binding.carrot4.visibility = View.VISIBLE
                    binding.carrot5.visibility = View.VISIBLE
                    binding.carrot6.visibility = View.VISIBLE
                    binding.carrot7.visibility = View.VISIBLE
                    binding.carrot8.visibility = View.VISIBLE
                    binding.carrot9.visibility = View.VISIBLE
                    binding.carrot10.visibility = View.VISIBLE
                    when (number2) {
                        1 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_1)
                            binding.carrot2.setImageResource(R.drawable.carrot_1)
                            binding.carrot3.setImageResource(R.drawable.carrot_1)
                            binding.carrot4.setImageResource(R.drawable.carrot_1)
                            binding.carrot5.setImageResource(R.drawable.carrot_1)
                            binding.carrot6.setImageResource(R.drawable.carrot_1)
                            binding.carrot7.setImageResource(R.drawable.carrot_1)
                            binding.carrot8.setImageResource(R.drawable.carrot_1)
                            binding.carrot9.setImageResource(R.drawable.carrot_1)
                            binding.carrot10.setImageResource(R.drawable.carrot_1)
                        }
                        2 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_2)
                            binding.carrot2.setImageResource(R.drawable.carrot_2)
                            binding.carrot3.setImageResource(R.drawable.carrot_2)
                            binding.carrot4.setImageResource(R.drawable.carrot_2)
                            binding.carrot5.setImageResource(R.drawable.carrot_2)
                            binding.carrot6.setImageResource(R.drawable.carrot_2)
                            binding.carrot7.setImageResource(R.drawable.carrot_2)
                            binding.carrot8.setImageResource(R.drawable.carrot_2)
                            binding.carrot9.setImageResource(R.drawable.carrot_2)
                            binding.carrot10.setImageResource(R.drawable.carrot_2)
                        }
                        3 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_3)
                            binding.carrot2.setImageResource(R.drawable.carrot_3)
                            binding.carrot3.setImageResource(R.drawable.carrot_3)
                            binding.carrot4.setImageResource(R.drawable.carrot_3)
                            binding.carrot5.setImageResource(R.drawable.carrot_3)
                            binding.carrot6.setImageResource(R.drawable.carrot_3)
                            binding.carrot7.setImageResource(R.drawable.carrot_3)
                            binding.carrot8.setImageResource(R.drawable.carrot_3)
                            binding.carrot9.setImageResource(R.drawable.carrot_3)
                            binding.carrot10.setImageResource(R.drawable.carrot_3)
                        }
                        4 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_4)
                            binding.carrot2.setImageResource(R.drawable.carrot_4)
                            binding.carrot3.setImageResource(R.drawable.carrot_4)
                            binding.carrot4.setImageResource(R.drawable.carrot_4)
                            binding.carrot5.setImageResource(R.drawable.carrot_4)
                            binding.carrot6.setImageResource(R.drawable.carrot_4)
                            binding.carrot7.setImageResource(R.drawable.carrot_4)
                            binding.carrot8.setImageResource(R.drawable.carrot_4)
                            binding.carrot9.setImageResource(R.drawable.carrot_4)
                            binding.carrot10.setImageResource(R.drawable.carrot_4)
                        }
                        5 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_5)
                            binding.carrot2.setImageResource(R.drawable.carrot_5)
                            binding.carrot3.setImageResource(R.drawable.carrot_5)
                            binding.carrot4.setImageResource(R.drawable.carrot_5)
                            binding.carrot5.setImageResource(R.drawable.carrot_5)
                            binding.carrot6.setImageResource(R.drawable.carrot_5)
                            binding.carrot7.setImageResource(R.drawable.carrot_5)
                            binding.carrot8.setImageResource(R.drawable.carrot_5)
                            binding.carrot9.setImageResource(R.drawable.carrot_5)
                            binding.carrot10.setImageResource(R.drawable.carrot_5)
                        }
                        6 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_6)
                            binding.carrot2.setImageResource(R.drawable.carrot_6)
                            binding.carrot3.setImageResource(R.drawable.carrot_6)
                            binding.carrot4.setImageResource(R.drawable.carrot_6)
                            binding.carrot5.setImageResource(R.drawable.carrot_6)
                            binding.carrot6.setImageResource(R.drawable.carrot_6)
                            binding.carrot7.setImageResource(R.drawable.carrot_6)
                            binding.carrot8.setImageResource(R.drawable.carrot_6)
                            binding.carrot9.setImageResource(R.drawable.carrot_6)
                            binding.carrot10.setImageResource(R.drawable.carrot_6)
                        }
                        7 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_7)
                            binding.carrot2.setImageResource(R.drawable.carrot_7)
                            binding.carrot3.setImageResource(R.drawable.carrot_7)
                            binding.carrot4.setImageResource(R.drawable.carrot_7)
                            binding.carrot5.setImageResource(R.drawable.carrot_7)
                            binding.carrot6.setImageResource(R.drawable.carrot_7)
                            binding.carrot7.setImageResource(R.drawable.carrot_7)
                            binding.carrot8.setImageResource(R.drawable.carrot_7)
                            binding.carrot9.setImageResource(R.drawable.carrot_7)
                            binding.carrot10.setImageResource(R.drawable.carrot_7)
                        }
                        8 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_8)
                            binding.carrot2.setImageResource(R.drawable.carrot_8)
                            binding.carrot3.setImageResource(R.drawable.carrot_8)
                            binding.carrot4.setImageResource(R.drawable.carrot_8)
                            binding.carrot5.setImageResource(R.drawable.carrot_8)
                            binding.carrot6.setImageResource(R.drawable.carrot_8)
                            binding.carrot7.setImageResource(R.drawable.carrot_8)
                            binding.carrot8.setImageResource(R.drawable.carrot_8)
                            binding.carrot9.setImageResource(R.drawable.carrot_8)
                            binding.carrot10.setImageResource(R.drawable.carrot_8)
                        }
                        9 -> {
                            binding.carrot1.setImageResource(R.drawable.carrot_9)
                            binding.carrot2.setImageResource(R.drawable.carrot_9)
                            binding.carrot3.setImageResource(R.drawable.carrot_9)
                            binding.carrot4.setImageResource(R.drawable.carrot_9)
                            binding.carrot5.setImageResource(R.drawable.carrot_9)
                            binding.carrot6.setImageResource(R.drawable.carrot_9)
                            binding.carrot7.setImageResource(R.drawable.carrot_9)
                            binding.carrot8.setImageResource(R.drawable.carrot_9)
                            binding.carrot9.setImageResource(R.drawable.carrot_9)
                            binding.carrot10.setImageResource(R.drawable.carrot_9)
                        }
                    }
                }
            }
        }else{
            binding.example.visibility = View.INVISIBLE
            binding.txtWarning.visibility = View.VISIBLE
        }
    }
}