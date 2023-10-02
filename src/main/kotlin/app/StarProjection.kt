package app

fun displayLength(array : Array<*>){
    println("total array is ${array.size}")
}

fun main() {
    val arrString = arrayOf("ahmad","ihsan")
    val arrInt = arrayOf(1,2,3,4,5,6,7)

    displayLength(arrString)
    displayLength(arrInt)
}