import kotlin.text.*

fun main() {
    printHelloWorld()
    printing()

    // This is an end-of-line comment

    /* This is a block comment
   on multiple lines. */
}

fun printHelloWorld(){
    print("Hello World")
}

fun printing() {
    print("Hello World")
    println("Hello world!")
}

fun functionBodyAsExpression(a: Int, b: Int) = a + b

fun voidReturnValueWithUnit(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

open class Clothing(var size: String, var color: String)

open class Clothing(var size: String, var color: String)

var s = 1
val s1 = "s is $s"

fun arbitraryExpInTemplate(): String {
    s = 2
    val s2 = "${s1.replace("is", "was")}, but now is ${s}"
    return s2
}


fun conditionalAsExpression(a: Int, b: Int) = if (a > b) a else b
