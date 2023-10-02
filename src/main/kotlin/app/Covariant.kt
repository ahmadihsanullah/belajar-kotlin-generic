package app

class Covariant<out T>(val data : T) {
    fun getDataku(): T {
        return data
    }

}

fun main() {
    val covariantString = Covariant("Ahmad")
    val covariantAny : Covariant<Any> = covariantString
    println(covariantAny.getDataku())
    //data tidak bisa diubah
//    covariantAny.data = 2
}