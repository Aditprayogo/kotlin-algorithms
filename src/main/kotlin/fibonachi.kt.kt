

fun main() {
    val n = 10
    var f_n1 = 1
    var f_n2 = 0

    /**
     * 1 1 2 3 5 8 13 21 34
     * f(n) = f(n-1) + f(n - 2)
     * f(2) = 1 + 0 = 1
     */

    print("Fibonachi : ")
    for (i in 1..n) {
        //first 1
        print(" $f_n1 " )
        //1
        val sum = f_n1 + f_n2

        f_n2 = f_n1

        f_n1 = sum
    }
}