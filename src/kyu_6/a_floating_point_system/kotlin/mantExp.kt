// https://www.codewars.com/kata/5df754981f177f0032259090/train/kotlin

package kyu_6.a_floating_point_system.kotlin

import java.math.BigDecimal
import java.math.RoundingMode

fun mantExp(aNumber: BigDecimal, digitsNumber: Int): String {
    val result = aNumber.setScale(digitsNumber + aNumber.scale() - aNumber.precision(), RoundingMode.DOWN)
    return result.unscaledValue().toString() + "P" + -result.scale()
}