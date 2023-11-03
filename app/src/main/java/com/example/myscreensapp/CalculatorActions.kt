package com.example.myscreensapp

sealed class CalculatorActions{
    data class Number(val number:Int):CalculatorActions()
    object Clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculator:CalculatorActions()
    data class Operation(val operation: CalculatorOperations): CalculatorActions()
}
