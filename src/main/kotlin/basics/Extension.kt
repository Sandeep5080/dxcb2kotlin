package basics

class Extension {

}
class Circle{
    fun area() :Double{
        return 2.8
    }
}
fun Circle.perimeter():Double{
    return 2.4
}
fun main(args: Array<String>){
    val obj = Circle()
    obj.area()
}