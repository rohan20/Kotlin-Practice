import model.Company

/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {

    val companyA = Company("Hello")
    val companyB = Company("Google X", 14)

    println(companyA.companyName)
    println(companyA.companyId)
    println(companyB.companyName)
    println(companyB.companyId)


}
