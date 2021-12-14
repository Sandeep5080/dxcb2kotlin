package Function

fun main(args : Array<String>) {
    //Ranges
    //val nums = 1..5
    // 1 2 3 4 5
   // val nums = 5 downTo 2
    //5  4 3 2 1
   // val nums = 5 downTo 1 step 2
    //5 3 1
    var nums = 'a' .. 'z'
    // a to z
   var isPresent = 'c' in nums
    //true
    for (a in nums) {
        println(a)
    }
    println("count is " + nums.count())
}