package com.example.myscreensapp.Navigation

import com.example.myscreensapp.CalculatorOperations

sealed class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperations? = null
)

