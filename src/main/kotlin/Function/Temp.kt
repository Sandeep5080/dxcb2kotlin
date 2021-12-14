package Function

fun main(args : Array<String>) {
    var squ = square()
    squ.side1 = 4
    squ.side2= 4
    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 4
    val name = "san"
    val Str = "Hello $name"
    val a = 10
    val b = 5
    println("the statement is $Str. the characters ${Str.length}")
    println("the sum of $a and $b is ${a+b}")
    println("the length  of rectangle is ${rect.length} and ${rect.breadth}. te area is ${rect.length*rect.breadth}")
    println("the sides  of square is ${squ.side1} and ${squ.side2}. the sides equal  ${squ.side1==squ.side2}")

}
 class Rectangle{
     var length: Int = 0
     var breadth: Int = 0
 }
class square{
     var side1: Int = 0
    var side2: Int = 0
}