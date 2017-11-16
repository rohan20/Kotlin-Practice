package model

/*
Created by rohan on 16/11/17  
*/

//all classes in Kotlin are final by default, which cannot be inherited.
//use 'open' to declare your class as non-final
open class ParentCompany {
    fun getParentCompanyName(): String {
        return "Alphabet"
    }
}