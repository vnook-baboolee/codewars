// https://www.codewars.com/kata/58485a43d750d23bad0000e6/train/kotlin

package kyu_7.fizz_buzz_cuckoo_clock.kotlin

fun fizzBuzzCuckooClock(time: String): String {
    val parts = time.split(":")
    val hour = parts[0].toInt()
    val minute = parts[1].toInt()
    require(parts.size == 2 && parts.all { it.matches("\\d+".toRegex()) })
    if (minute == 0) {
        val cuckooCount = if (hour % 12 == 0) 12 else hour % 12
        return "Cuckoo ".repeat(cuckooCount).trim()
    }
    if (minute == 30) {
        return "Cuckoo"
    }
    return when {
        minute % 3 == 0 && minute % 5 == 0 -> "Fizz Buzz"
        minute % 3 == 0 -> "Fizz"
        minute % 5 == 0 -> "Buzz"
        else -> "tick"
    }
}

