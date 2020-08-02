package com.example.ccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number : String = ""
    private var numberOne : Float = 0.0F
    private var numberTwo : Float = 0.0F
    private var isAddition : Boolean = false
    private var isDivide : Boolean = false
    private var isReduction : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun operationFunction(view: View){
        val editText : EditText? = findViewById(R.id.edit_text)

        when(view.id){
            R.id.button_1 -> {
                number += "1"
                editText?.setText(number)
            }
            R.id.button_2 -> {
                number += "2"
                editText?.setText(number)
            }
            R.id.button_3 -> {
                number += "3"
                editText?.setText(number)
            }
            R.id.button_4 -> {
                number += "4"
                editText?.setText(number)
            }
            R.id.button_5 -> {
                number += "5"
                editText?.setText(number)
            }
            R.id.button_6 -> {
                number += "6"
                editText?.setText(number)
            }
            R.id.button_7 -> {
                number += "7"
                editText?.setText(number)
            }
            R.id.button_8 -> {
                number += "8"
                editText?.setText(number)
            }
            R.id.button_9 -> {
                number += "9"
                editText?.setText(number)
            }
            R.id.button_0 -> {
                number += "0"
                editText?.setText(number)
            }
            R.id.button_clear -> {
                number = ""
                editText?.setText(number)
            }
            R.id.button_dot -> {
                number += "."
                editText?.setText(number)
            }
            R.id.button_plus -> {
                if(number.isBlank()){
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number = ""
                }
            }
            R.id.button_minus -> {
                if(number.isBlank()){
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isReduction = true
                    number = ""
                }
            }
            R.id.button_divide -> {
                if(number.isBlank()){
                    editText?.setText("")
                } else {
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isDivide = true
                    number = ""
                }
            }
            R.id.button_equal -> {
                numberTwo = number.toFloat()
                if(isAddition){
                    editText?.setText((numberOne + numberTwo).toString())
                    isAddition = false
                }
                if(isDivide){
                    editText?.setText((numberOne / numberTwo).toString())
                    isDivide = false
                }
                if(isReduction){
                    editText?.setText((numberOne - numberTwo).toString())
                    isReduction = false
                }

            }
        }
    }
}