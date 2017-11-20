import `interface`.ExampleInterface
import enum.CompanyAction
import model.Company
import model.DataCompany
import singleton.CompanySingleton

/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {

    val companyA = Company("Google")

    println("CompanyA action: " + companyA.action)

    companyA.setCompanyAction(CompanyAction.INCREASE_SALARY)

    println("CompanyA action: " + companyA.action)

}
