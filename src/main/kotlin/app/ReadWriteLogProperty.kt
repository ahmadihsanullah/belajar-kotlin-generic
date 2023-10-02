package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ReadWriteLogProperty(var data: String) : ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property $property.name with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property $property.name from $data to $value")
        data = value
    }
}

class Person(param : String){
    var name : String by ReadWriteLogProperty(param)
}

fun main() {
    val person = Person("ahmad")
    println(person.name)

    person.name = "ihsan"

    println(person.name)
}