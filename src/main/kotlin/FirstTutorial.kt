/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>){
    println()
//    println("What's your name?")
//    val name = readLine();
//    println("Hello " + name)

//    val number = 2
//    val answer = number + 5
    val newValue: Int? = readLine()?.toInt()
    println(newValue)

    when(newValue){
        2 -> println("Two")
        5 -> println("Five")
    }

}