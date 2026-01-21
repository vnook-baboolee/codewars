package kyu_7.fizz_buzz_cuckoo_clock.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Tests {
    @Test
    fun someBasicTimesTests () {
        println("Testing with time 13:34")
        assertEquals("tick", fizzBuzzCuckooClock("13:34"))
        println("Testing with time 21:00")
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("21:00"))
        println("Testing with time 11:15")
        assertEquals("Fizz Buzz", fizzBuzzCuckooClock("11:15"))
        println("Testing with time 03:03")
        assertEquals("Fizz", fizzBuzzCuckooClock("03:03"))
        println("Testing with time 14:30")
        assertEquals("Cuckoo", fizzBuzzCuckooClock("14:30"))
        println("Testing with time 08:55")
        assertEquals("Buzz", fizzBuzzCuckooClock("08:55"))
        println("Testing with time 00:00")
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("00:00"))
        println("Testing with time 12:00")
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("12:00"))
    }
}
