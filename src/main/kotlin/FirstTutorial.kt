/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {
    println()

    val newCompaniesList = arrayListOf<String>()
    newCompaniesList.add("Nokia")

    var newCompanyName: String
    var companyNameToBeDeleted: String
    var userChoice = "dummyInput"


    //1. Add company
    //2. Delete company
    //3. Exit
    while (userChoice != "3") {

        println("1. Add company")
        println("2. Delete company")
        println("3. Exit")
        userChoice = readLine()!!

        //add
        if (userChoice == "1") {
            println()
            print("Enter new company name: ")
            newCompanyName = readLine()!!
            newCompaniesList.add(newCompanyName)
        } else if (userChoice == "2") {
            print("Enter company name to be deleted: ")
            companyNameToBeDeleted = readLine()!!

            newCompaniesList.remove(companyNameToBeDeleted)
        } else {
            return
        }

        for (companyName in newCompaniesList) {
            println(companyName)
        }

        println()

    }

}