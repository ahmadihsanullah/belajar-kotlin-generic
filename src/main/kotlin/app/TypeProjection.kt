package app

class Container<T>(var data: T)

fun copyData(from: Container<out Any>, to: Container<in Any>){
    to.data = from.data
    //contravariant = covariant

}

fun main() {
    val container1 = Container("ahmad")
    val container2 : Container<Any> = Container("ihsan")

    copyData(container1, container2)

    println(container1.data)
    println(container2.data)
}
