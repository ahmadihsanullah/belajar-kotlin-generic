package app

class Invariant<T>(val data: T)

fun main() {
    val data = Invariant<String>("ahmad")
//    val data2 : Invariant<Any> = data// error
}