// https://www.codewars.com/kata/5d98b6b38b0f6c001a461198/train/kotlin

package kyu_6.binaries.kotlin

fun code(string: String): String {
    val binaryDigits = string.map { digit ->
        digit.toString().toInt().toString(2)
    }
    return binaryDigits.joinToString("") { binary ->
        "0".repeat(binary.length - 1) + "1" + binary
    }
}

fun decode(str: String): String {
    val encodedDigits = (0..9).map { digit ->
        code(digit.toString())
    }
    var result = ""
    var remaining = str

    while (remaining.isNotEmpty()) {
        for (i in encodedDigits.indices) {
            if (remaining.startsWith(encodedDigits[i])) {
                result += i
                remaining = remaining.substring(encodedDigits[i].length)
                break
            }
        }
    }

    return result
}
