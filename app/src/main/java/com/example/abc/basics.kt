package com.example.abc
// variables
fun main() {
    // Immutable variable (cannot be changed)
    val name: String = "Alice"

    // Mutable variable (can be changed)
    var age: Int = 25

    println("Name: $name")
    println("Age: $age")

    // Changing the value of 'age'
    age = 26
    println("Updated Age: $age")
}
