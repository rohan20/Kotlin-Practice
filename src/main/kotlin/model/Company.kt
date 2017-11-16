package model

/*
Created by rohan on 15/11/17  
*/

class Company: ParentCompany() {

    private var companyName = "Google";

    fun getCompanyName(): String {
        return companyName;
    }

}

