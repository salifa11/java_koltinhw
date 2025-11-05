package com.example.abc

fun main() {
    sayHello()
    greet("Sita")
    val result = add(10, 20)
    println("Sum: $result")
}

fun sayHello() {
    println("Hello, world!")
}

fun greet(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
