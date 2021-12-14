package Function

fun main(args : Array<String>) {
    val x = 23


    var Str:String =  when(x) {
      //  in 1..20 -> Str ="x lies in 1 to 20"
       // 0,1 -> Str = " x is  0 or 1"
        1 ->  " x is 1"
        2 -> " x is 2"
        else -> {

             "x value is unknown"
            //Str ="x  value is hello"
               "x is fun"

        }
    }
    println(Str)
}