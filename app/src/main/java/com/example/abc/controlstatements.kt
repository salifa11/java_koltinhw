package com.example.abc

fun main() {

    // 1. IF - ELSE
    val number = 10
    if (number > 0) {
        println("Number is positive")
    } else {
        println("Number is not positive")
    }


    // 2. WHEN (like switch in other languages)

    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Other day")
    }

    // 3. FOR LOOP

    for (i in 1..5) {
        println("Count: $i")
    }


    // 4. WHILE LOOP

    var x = 1
    while (x <= 3) {
        println("While loop number: $x")
        x++
    }
}
