package data

class Function(val name: String) {
    fun<T> sayHello(name : T){
        println("Hello ${name} my name is ${this.name}")
    }
}