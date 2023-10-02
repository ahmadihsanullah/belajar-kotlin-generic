package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData("ahmad", 5)
    myDataString.printData()

    val myDataInt = MyData(100, "ahmad")
    myDataInt.printData()
}