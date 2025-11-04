package com.example.abc

fun main() {
    // 🔹 Fixed-size array
    var age = arrayOf(1, 2, 3)
    println(age.contentToString()) // prints the array nicely
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("*******************************")

    // 🔹 Array of strings
    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "salifa" // modify element
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])
    println("Size of name array: " + name.size)

    println("*******************************")

    // 🔹 ArrayList (dynamic size)
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20) // add 20 at index 1
    age1.add(5)

    var age2 = arrayListOf(1, 20, 5) // initialize directly

    var names = arrayListOf("salifa", "ram", "shyam")
    names.add("hari")
    names.add(4, "Sita")
    names.remove("shyam")
    names.removeAt(0)
    println(names)

    println("*******************************")

    // 🔹 Mixed-type ArrayList
    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}
