package model

/*
Created by rohan on 15/11/17  
*/

class Company(companyNameParam: String, companyIdParam: Int) : ParentCompany() {
    var companyName = companyNameParam;
    var companyId = companyIdParam;
}

