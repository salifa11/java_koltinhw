package com.example.abc


// DataTypeExample
fun main() {
    // Primitive Data Type
    val age: Byte = 25             // 1 byte — small integer
    val year: Short = 2025         // 2 bytes — slightly larger integer
    val salary: Int = 50000        // 4 bytes — common integer type
    val distance: Long = 123456789L // 8 bytes — very large number, must end with 'L'

    val price: Float = 99.99f      // 4 bytes — decimal number, must end with 'f'
    val pi: Double = 3.14159       // 8 bytes — more precise decimal number

    val grade: Char = 'A'          // 2 bytes — single character
    val Salifa: Boolean = true  // 1 bit — stores true or false

    // Non-primitive Data Type
    val name: String = "Alice"

    // Print all values
    println("Name: $name")
    println("Age: $age")
    println("Year: $year")
    println("Salary: $salary")
    println("Distance: $distance")
    println("Price: $price")
    println("Pi: $pi")
    println("Grade: $grade")
    println("Salifa? $Salifa")
}

