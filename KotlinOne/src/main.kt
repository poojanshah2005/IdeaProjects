import com.poojan.Person

fun main(args: Array<String>) {
    println("Hello, world!")
    val poojan = Person("Poojan")
    poojan.display()

    val dave = Person("Dave")
    dave.display()

    dave.displayWithLambda (::printName)
    }

fun printName(name: String){
    println(name)
}
