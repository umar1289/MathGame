package com.test.mymathgame

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
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

        binding.card1.setCardBackgroundColor(Color.parseColor("#16A5FF"))
        binding.card2.setCardBackgroundColor(Color.parseColor("#16A5FF"))
        binding.card3.setCardBackgroundColor(Color.parseColor("#16A5FF"))
        binding.card4.setCardBackgroundColor(Color.parseColor("#16A5FF"))

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        random()

        binding.card1.setOnClickListener {
            timer(binding.card1, binding.txt1)
        }

        binding.card2.setOnClickListener {
            timer(binding.card2, binding.txt2)
        }

        binding.card3.setOnClickListener {
            timer(binding.card3, binding.txt3)
        }

        binding.card4.setOnClickListener {
            timer(binding.card4, binding.txt4)
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

    fun timer(card: CardView, text: TextView) {
        val timer = object : CountDownTimer(1200, 1200) {
            override fun onTick(p0: Long) {
                val animation1 = AnimationUtils.loadAnimation(context, R.anim.anim1)
                val animation2 = AnimationUtils.loadAnimation(context, R.anim.anim2)
                if (text.text.toString() == trueAnswer.toString()) {
                    card.setCardBackgroundColor(Color.parseColor("#51CB00"))
                    card.startAnimation(animation2)
                    point++
                } else {
                    card.startAnimation(animation1)
                    card.setCardBackgroundColor(Color.parseColor("#EC1F40"))
                    false_answer++
                }

                binding.card1.isClickable = false
                binding.card2.isClickable = false
                binding.card3.isClickable = false
                binding.card4.isClickable = false

            }

            override fun onFinish() {
                card.clearAnimation()

                if (task == 10) {

                    activity?.onBackPressed()
                    findNavController().navigate(R.id.resultFragment)
                }
                task++
                binding.task.text = "Task: $task"
                binding.card1.isClickable = true
                binding.card2.isClickable = true
                binding.card3.isClickable = true
                binding.card4.isClickable = true
                card.setCardBackgroundColor(Color.parseColor("#16A5FF"))
                random()
            }
        }
        timer.start()
    }
}