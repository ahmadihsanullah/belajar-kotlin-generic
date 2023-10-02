package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ReadOnlyProperty(val data: String) : ReadOnlyProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property $property.name, with value $data")
        return data.uppercase()
    }
}



class nameWithLog(param: String){
    val name: String by app.ReadOnlyProperty(param)
}

fun main() {
    val name = nameWithLog("Ahmad")
    println(name.name)

}