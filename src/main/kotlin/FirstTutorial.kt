import model.Company

/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {

    val company = Company()

    println("Company Name from getter: " + company.getCompanyName())
    println("Parent Company name: " + company.getParentCompanyName())

}
