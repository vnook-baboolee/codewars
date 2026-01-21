// https://www.codewars.com/kata/55b4d87a3766d9873a0000d4/train/kotlin

package kyu_6.how_much.kotlin

fun howmuch(m: Int, n: Int): String {
    val start = if (m <= n) m else n
    val end =  if (m >= n) m else n
    var result = ""
    for (i in start..end) {
        if (i % 7 == 2 && i % 9 == 1) {
            result += "[M: $i B: " + i / 7 + " C: " + i / 9 + "]"
        }
    }
    return "[$result]"
}