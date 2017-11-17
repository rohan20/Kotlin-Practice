package model

/*
Created by rohan on 15/11/17  
*/

class Company : ParentCompany {

    var companyName: String = ""
    var companyId: Int = 0

    constructor(companyName: String) {
        this.companyName = companyName
    }

    constructor(companyName: String, companyId: Int){
        this.companyName = companyName
        this.companyId = companyId
    }

}

