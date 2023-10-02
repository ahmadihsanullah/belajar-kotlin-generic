package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class logObservableProperty<T>(data: T) : ObservableProperty<T>(data){
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before change property $property from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("after change property $property from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int){

    var brand : String by logObservableProperty(brand)
    var year : Int by logObservableProperty(year)
    var owner: String by Delegates.notNull()
    var description: String by Delegates.vetoable("mobil"){
        property, oldValue, newValue ->
            println("before change property $property from $oldValue to $newValue")
            true
    }

    var other : String by Delegates.observable(""){
        property, oldValue, newValue ->
        println("after change property $property from $oldValue to $newValue")
    }

}

fun main() {
    val car1 = Car("Toyota", 2019)
    println(car1.brand)
    println(car1.year)

    car1. brand = "Wuling"
    println(car1.brand)

    car1.year = 2019
    println(car1.year)

    //properti harus diset agar tidak null
    car1.owner="Jamal"
    println(car1.owner)

    car1.description = "Mobil terbaik"
    println(car1.description)

    car1.other = "ini Mobil terbaik"
    println(car1.other)
}

