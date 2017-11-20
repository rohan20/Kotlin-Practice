import `interface`.ExampleInterface
import model.Company
import model.DataCompany
import singleton.CompanySingleton

/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {

    val companyA = CompanySingleton

    companyA.name = "Nokia"

    println("companyA.name: " + companyA.name)

    val companyB = CompanySingleton

    println("companyB.name: " + companyB.name)

    companyB.name = "Samsung"

    println("companyA.name: " + companyA.name)
    println("companyB.name: " + companyB.name)

}
