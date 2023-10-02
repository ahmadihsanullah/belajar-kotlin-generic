package app

import data.ComparableFruit
import java.util.Arrays

fun main() {
    val fruit1 = ComparableFruit("apel", 100)
    val fruit2 = ComparableFruit("melon", 12)
    val fruit3 = ComparableFruit("mangga", 14)
    val fruit4 = ComparableFruit("jambu", 15)
    val fruit5 = ComparableFruit("sirsak", 19)

    val fruits = arrayOf(fruit1, fruit2, fruit3, fruit4, fruit5)

    Arrays.sort(fruits)

    for(fruit in fruits){
        println("${fruit.name} : ${fruit.quantity} ")
    }
}