

fun main() {

    val nama = intArrayOf(1,3,5,3,2)
    var reverse_string = ""

    for (i in nama.size - 1 downTo 0) reverse_string = reverse_string + " " + nama[i]

    println(reverse_string)
}