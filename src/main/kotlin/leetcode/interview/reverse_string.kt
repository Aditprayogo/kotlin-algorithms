package leetcode.interview

fun main() {

    val charArray : CharArray =
        charArrayOf('h', 'e', 'e','l','l','0')
    reverseString(charArray)
}

fun reverseString(s : CharArray) : Unit {
    var pointer1 = 0
    var pointer2 = s.size -1

    while (pointer1 < pointer2) {
        var temp = s[pointer1]
        s[pointer1] = s[pointer2]
        s[pointer2] = temp
        pointer1 += 1
        pointer2 -= 1
    }

    print(s)
}