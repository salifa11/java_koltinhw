package com.example.abc

fun main() {

    // 1. LIST
    val fruits = listOf("Apple", "Banana", "Cherry") // Immutable
    println("Immutable List: $fruits")

    val animals = mutableListOf("Dog", "Cat") // Mutable
    animals.add("Rabbit")
    println("Mutable List: $animals")

    // 2. SET
    val numbers = setOf(1, 2, 3, 2) // Immutable, duplicates ignored
    println("Immutable Set: $numbers")

    // Mutable Set
    val mutableNumbers = mutableSetOf(10, 20, 30)
    println("Mutable Set before adding/removing: $mutableNumbers")

    // Add elements
    mutableNumbers.add(40)
    mutableNumbers.add(20) // duplicate, won't be added
    println("Mutable Set after adding: $mutableNumbers")

    // Remove element
    mutableNumbers.remove(10)
    println("Mutable Set after removing 10: $mutableNumbers")

    // 3. MAP
    val ages = mapOf("Alice" to 25, "Bob" to 30) // Immutable
    println("Immutable Map: $ages")

    val mutableAges = mutableMapOf("X" to 100, "Y" to 200) // Mutable
    mutableAges["Z"] = 300
    println("Mutable Map: $mutableAges")
}

val a = listOf(1,2,3)
val b = setOf(3,4,5)
var c = mutableListOf(8,9,10)
c.add(11)