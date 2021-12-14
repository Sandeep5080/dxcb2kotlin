package basics

fun main(args : Array<String>) {
    var Str: String? = null

    var ram : Ram? = Ram()
    ram = null

    print(ram?.name)
}