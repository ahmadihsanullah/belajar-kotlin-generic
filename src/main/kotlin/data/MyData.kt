package data

class MyData<T, U>(val fisrtData: T, val secondData: U) {
    fun getFirst(): T = fisrtData

    fun getSecond(): U = secondData

    fun printData() = println("data is $fisrtData $secondData")

}