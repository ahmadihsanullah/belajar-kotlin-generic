package app

class Data<T>(val data: T)

fun Data<String>.print(){
    val data : String = this.data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("ahmad")

//    data.print() //error
    data2.print()
}