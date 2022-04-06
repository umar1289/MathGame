package com.test.mymathgame

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.test.mymathgame.databinding.FragmentPlayBinding
import kotlinx.android.synthetic.main.custom_dialog.view.*
import kotlinx.android.synthetic.main.fragment_settings.*
import java.util.*

var fromNumbersRangeTextA = 1
var toNumbersRangeTextA = 10
var fromNumbersRangeTextB = 1
var toNumbersRangeTextB = 10
var point = 0
var false_answer = 0

class PlayFragment : Fragment() {
    var number1 = 0
    var number2 = 0
    var trueAnswer = 0
    var answer = 0
    var falseAnswer1 = 0
    var falseAnswer2 = 0
    var falseAnswer3 = 0
    var task = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        point = 0
        false_answer = 0
    }

    lateinit var binding: FragmentPlayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayBinding.inflate(LayoutInflater.from(context))

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        random()

        binding.card1.setOnClickListener {
            if (binding.txt1.text.toString().toInt() == trueAnswer && task != 10) {
                point++
                random()
            } else if (task != 10) {
                false_answer++
                random()
            }
            if (task == 10) {
                if (binding.txt1.text.toString().toInt() == trueAnswer) {
                    point++
                } else if (task != 10) {
                    false_answer++
                }
                activity?.onBackPressed()
                findNavController().navigate(R.id.resultFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card2.setOnClickListener {
            if (binding.txt2.text.toString().toInt() == trueAnswer && task != 10) {
                point++
                random()
            } else if (task != 10) {
                false_answer++
                random()
            }
            if (task == 10) {
                if (binding.txt1.text.toString().toInt() == trueAnswer) {
                    point++
                } else if (task != 10) {
                    false_answer++
                }
                activity?.onBackPressed()
                findNavController().navigate(R.id.resultFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card3.setOnClickListener {
            if (binding.txt3.text.toString().toInt() == trueAnswer && task != 10) {
                point++
                random()
            } else if (task != 10) {
                false_answer++
                random()
            }
            if (task == 10) {
                if (binding.txt1.text.toString().toInt() == trueAnswer) {
                    point++
                } else if (task != 10) {
                    false_answer++
                }
                activity?.onBackPressed()
                findNavController().navigate(R.id.resultFragment)
            } else {
                task++
                binding.task.text = "Task: $task"
            }
        }

        binding.card4.setOnClickListener {
            if (binding.txt4.text.toString().toInt() == trueAnswer && task != 10) {
                point++
                random()
            } else if (task != 10) {
                false_answer++
                random()
            }
            if (task == 10) {
                if (binding.txt1.text.toString().toInt() == trueAnswer) {
                    point++
                } else if (task != 10) {
                    false_answer++
                }
                activity?.onBackPressed()
                findNavController().navigate(R.id.resultFragment)
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
}