import `interface`.ExampleInterface
import model.Company
import model.DataCompany

/*
Created by rohan on 10/11/17  
*/

fun main(args: Array<String>) {
    speakName(object : ExampleInterface {
        override fun speakMyName(name: String) {
            println("Name: $name")
        }

    })
}

fun speakName(callback: ExampleInterface) {
    callback.speakMyName("Rohan")
    callback.speakMyName("Taneja")
}
