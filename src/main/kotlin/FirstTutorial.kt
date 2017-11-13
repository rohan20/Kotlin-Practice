/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {
    println()
    print("Enter your name: ")
    val name: String? = readLine()
    printUsername(name)
    displayChristmasGreeting()
    displayNewYearGreeting()
}

fun printUsername(name: String?){
    print("\nHey $name, ")
}

fun displayChristmasGreeting(){
    print("we wish you a Merry Christmas")
}

fun displayNewYearGreeting() {
    println(" and a Happy New Year!")
}