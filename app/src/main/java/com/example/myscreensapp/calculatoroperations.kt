package com.example.myscreensapp

sealed class CalculatorOperations(val symbol: String){
    object Add: CalculatorOperations("+")
    object subtract: CalculatorOperations("-")
    object multiply: CalculatorOperations("*")
    object divide: CalculatorOperations("/")
}