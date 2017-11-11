/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {
    println()

    val newCompaniesList = arrayListOf<String>()
//    newCompaniesList.add("Nokia")

    var newCompanyName: String = "dummyName"

    //iterate through loop unless user presses the return key i.e. no input
    while (newCompanyName != "") {

        println()
        print("Enter new company name: ")
        newCompanyName = readLine()!!

        newCompaniesList.add(newCompanyName)
        for (companyName in newCompaniesList) {
            println(companyName)
        }
    }

}