// https://www.codewars.com/kata/59b33a4a8bcb77608e000103/train/kotlin

package kyu_6.tricky_kotlin_1_invoke_a_string.kotlin

import java.io.File

operator fun String.invoke(arg: String): String {
    return arg
}

operator fun String.invoke(arg: Int): Int {
    return arg
}

operator fun String.invoke(arg: Long): Long {
    return arg
}

operator fun String.invoke(arg: File): File {
    return arg
}

