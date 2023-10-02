package app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure("ahmad")
    val dataString = data1.getData()
    println(dataString)

    //type erasure dimana generic type yang kita berikan saat di
    // sudah di compile akan menjadi object atau any
    // konversi tipe data generic akan berbahaya
    //karena semua generic type akan diterima
    val data2 = data1 as TypeErasure<Int>
    val dataInt = data2.getData()
    println(dataInt)
}