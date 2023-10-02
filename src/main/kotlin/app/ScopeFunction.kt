package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class readWriteLogUser<T>(data: T): ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("property  $property change from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("property $property change from $oldValue to $newValue")
    }
}

class User(username: String, password: String){
    var name: String by readWriteLogUser(username)
    var password: String by readWriteLogUser(password)
}

fun main() {
    val user1 = User("ahmad", "rahasia")
    user1.let {
        println(it.name)
    }
    with(user1) {
        println(name)
        println(password)
    }

    val names = arrayOf("a", "b", "c", "d")
}