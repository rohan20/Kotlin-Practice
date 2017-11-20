package model

import `interface`.CompanyInterface
import enum.CompanyAction

/*
Created by rohan on 15/11/17  
*/

class Company : ParentCompany, CompanyInterface {
    override fun submitRevenueDetails() {
        println("$10,000")
    }

    var companyName: String = ""
    var companyId: Int = 0

    constructor(companyName: String) {
        this.companyName = companyName
    }

    constructor(companyName: String, companyId: Int) {
        this.companyName = companyName
        this.companyId = companyId
    }

    var action = CompanyAction.HIRE_EMPLOYEE

    fun setCompanyAction(action: CompanyAction) {
        this.action = action
    }

}

