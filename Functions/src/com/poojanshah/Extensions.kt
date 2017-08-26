package com.poojanshah
fun main(args: Array<String>){
    val text = "With   mutliple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEX())
}

fun replaceMultipleWhiteSpace(value :String): String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceEX(): String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}