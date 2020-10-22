import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val sisi = input.nextInt()
    pola1(sisi)
    pola2(sisi)
    pola3(sisi)
    pola4(sisi)
}

fun pola1(sisi : Int) {

    println("Pola1")

    // for(i = i; i <= sisi; i++)
    for (i in 1..sisi) {

        // for(j = 1; j <= i; j++)
        for (j in 1..i) print(" * ")

        println()
    }
}

fun pola2(sisi : Int) {

    println("Pola2")

    // for(i = sisi; i >= 1; i--)
    for (i in sisi downTo 1) {

        // for(j = i; j >= 1; i--)
        for (j in i downTo 1) print(" * ")

        println()
    }
}

fun pola3(sisi : Int) {

    println("Pola3")

    // for(i = 1; i <= sisi; i++)

    for (i in 1..sisi) {

        // for(j = 1; j < i; j++)
        for (j in 1 until i) print("   ")

        // for(k = sisi; k >= sisi; k--)
        for (k in sisi downTo i) print(" * ")

        println()
    }
}

fun pola4(sisi : Int) {

    println("Pola4")

    for (i in sisi downTo 1) {

        // for (j = i; j > i; j--)
        for (j in i downTo 2) print("   ")

        // for(k = sisi; k <= sisi; k++)
        for (k in i..sisi) print(" * ")

        println()
    }
}