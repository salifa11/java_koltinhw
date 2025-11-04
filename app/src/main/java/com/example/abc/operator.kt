package com.example.abc

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 3
    println("a + b = ${a + b}") // 13
    println("a - b = ${a - b}") // 7
    println("a * b = ${a * b}") // 30
    println("a / b = ${a / b}") // 3
    println("a % b = ${a % b}") // 1

    // Comparison Operators
    println("a == b: ${a == b}") // false
    println("a > b: ${a > b}")   // true

    // Logical Operators
    val x = true
    val y = false
    println("x && y: ${x && y}") // false
    println("x || y: ${x || y}") // true

    // Increment / Decrement
    var c = 5
    c++
    println("c after c++: $c") // 6
    c--
    println("c after c--: $c") // 5
}
