package com.example.abc

fun main() {
    // User-defined function
    sayHello("Alice")  // calling our own function

    // Standard library function
    val text = "kotlin"
    println(text.uppercase())  // converts text to uppercase
}

// This is a user-defined function
fun sayHello(name: String) {
    println("Hello, $name!")
}
