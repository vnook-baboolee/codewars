package kyu_6.a_floating_point_system.kotlin

import junit.framework.TestCase.assertEquals
import java.math.BigDecimal
import org.junit.Test

class floatrepresentTest {
    private fun testing(aNumber: BigDecimal, digitsNumber: Int, exp: String) {
        println("aNumber: $aNumber")
        println("digitsNumber: $digitsNumber")
        val actual = mantExp(aNumber, digitsNumber)
        println("Actual: $actual")
        println("Expect: $exp")
        println("#")
        assertEquals(exp, actual)
    }
    @Test
    fun test() {
        var x = BigDecimal("0.06")
        testing(x, 10, "6000000000P-11")
        x = BigDecimal("72.0")
        testing(x, 12, "720000000000P-10")
        x = BigDecimal("1.0")
        testing(x, 5, "10000P-4")
        x = BigDecimal("123456.0")
        testing(x, 4, "1234P2")
        x = BigDecimal("1.103000")
        testing(x, 10, "1103000000P-9")

    }

}