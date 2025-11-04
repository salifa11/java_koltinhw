package com.example.abc

fun main() {
    val num: Int = 10          // Int value
    val numDouble: Double = num.toDouble()  // Convert Int → Double
    val text: String = num.toString()       // Convert Int → String
    val str: String = "25"
    val strToInt: Int = str.toInt()         // Convert String → Int

    println("Int to Double: $numDouble")
    println("Int to String: $text")
    println("String to Int: $strToInt")
}
