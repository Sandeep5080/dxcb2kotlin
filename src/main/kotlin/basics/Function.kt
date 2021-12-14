package basics

fun main(args : Array<String>){
   var result =  max(8,9)

    println(result)

}
fun add(a : Int, b:Int): Int= a+b
fun max(a: Int,  b:Int) :Int = if(a>b) a else b