package basics
fun main(args : Array<String>) {
val num : Int = 2
var Str = when(num) {
    1 -> "one"
    2 -> "Two"
    3 -> "Three"
    else -> "Give proper input"
}
    println("Str is $Str")

}