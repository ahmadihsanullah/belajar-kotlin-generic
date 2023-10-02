package app

class Contravariant<in T>{
    fun sayHello(data: T){
        println("hello $data")
    }

    //error
//    fun view():T{
//        return data
//    }

}

fun main() {
    val contravariantAny = Contravariant<Number>()
    val contravariantString : Contravariant<Int> = contravariantAny
    contravariantAny.sayHello(1)
}