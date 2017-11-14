/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {
    println()
    print("Enter your name: ")
    val name: String? = readLine()
    printUsername(name)
    val christmasGreeting = displayChristmasGreeting()
    print(christmasGreeting)
    displayNewYearGreeting()

    val addition = doAdditionOfTwoNumbers(41, 5)
    println("Addition: $addition")
}

fun doAdditionOfTwoNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun printUsername(name: String?) {
    print("\nHey $name, ")
}

fun displayChristmasGreeting(): String {
    return "we wish you a Merry Xmas"
}

fun displayNewYearGreeting() {
    println(" and a Happy New Year!")
}