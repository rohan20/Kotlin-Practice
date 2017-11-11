/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>){
    println()

    //list is read only (no add() method)
    val companiesList = listOf<String>("Google", "Apple", "Samsung", "OnePlus")
    //to add elements, use arrayListOf<>()
    val newCompaniesList = arrayListOf<String>()
    newCompaniesList.add("Nokia")
    newCompaniesList.addAll(companiesList)

    for(company in newCompaniesList){
        println()
        print("Hello, ")
        print(company)
    }

    println()

}