package app

interface canSayHello{
     fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class vicePresident : Employee(), canSayHello{
    override fun sayHello(name: String) {
        println("hello $name")
    }
}

class Company<T>(val employee: T) where T : Employee, T: canSayHello
//menggunkan where jika class generic menerima lebih dari 1 parameter type
fun main() {
//    val manager = Company(Manager())
    val vicePresident   = Company(vicePresident())
//    val employe = Company(Employee())
}