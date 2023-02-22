class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean){
    fun eat(): Unit{
        println("$name is eating.")
    }

    fun sleep(): Unit{
        println("$name is sleeping")
    }
}

fun main(args: Array<String>) {
    val cat = Animal("Tono", 4.2, 2,true)
    println("Name: ${cat.name}, Weight: ${cat.weight}, Age: ${cat.age}, mammal: ${cat.isMammal}" )
    cat.eat()
    cat.sleep()
}