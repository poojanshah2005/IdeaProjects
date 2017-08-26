import java.util.*

fun main(args: Array<String>) {
//    println("Hello World!")
//    val q: Question = Question()
////    val q:Question? = null
//    q.Answer = "42"
//    q.display()
//    println("The answer to the question ${q.Question} is ${q.Answer}")
//    q.displayResult()

//    var myValues = 1..10
//
//    for(i in 1 until  10){
//        println(i)
//    }

//    var numbers =  listOf<Int>(1,2,3,4,5)
////    for(i in numbers){
////        println(i)
////    }
//
//    var ages = TreeMap<String,Int>()
//    ages["Poojan"] = 15
//    ages["K"] = 12
//
//    for((name,age) in ages){
//        println("$name is $age")
//    }
//
//    for((index,element) in numbers.withIndex()){
//        println("$element is at index $index")
//    }



}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "42"
    val Question = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun displayResult() {
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            "" -> println("Try Again?")
            else -> println("Try Again?")
        }
    }
}