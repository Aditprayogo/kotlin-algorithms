

fun main() {
    val n = 10
    var f_n1 = 1
    var f_n2 = 0
    var f_n = 1

    /**
     * fn = fn-1 + fn-2
     * fn-2 = fn-1
     * fn-1 = fn
     */

    /**
     * Iterasi 1
     * fn-2 = 0
     * fn-1 = 1
     * fn = 1
     */

    /**
     * Iterasi 2
     * fn-2 = 1
     * fn-1 = 1
     * fn = 2
     */

    /**
     * Iterasi 3
     * fn-2 = 1
     * fn-1 = 2
     * fn = 3
     */

    print("Fibonachi : ")
    for (i in 1..n) {
        //first 1
        print(" $f_n " )
        f_n = f_n1 + f_n2
        f_n2 = f_n1
        f_n1 = f_n
    }
}