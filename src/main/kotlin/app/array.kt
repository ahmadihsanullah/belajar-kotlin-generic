package app

fun main() {
    val group = arrayOfNulls<Any?>(10)

    group[0] = "aku"
    group[1] = "aku lagi"
    for(i in group){
        if(i!=null)
        println(i)
    }
}
