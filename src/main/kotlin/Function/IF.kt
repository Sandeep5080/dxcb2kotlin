package Function

fun main(args : Array<String>) {
    val a = 2
    val b = 4
    var maxValue : Int = if (a > b) {
        print("a is greater")
        a
    }
    else {
        print("b is greater. and value is ")
        b
    }

    println(maxValue)

}