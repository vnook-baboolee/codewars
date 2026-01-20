package kyu_6.how_much.kotlin

import org.junit.Assert.*
import org.junit.Test

class CarboatTest {
    //----------------
    @Test
    fun BasicTests() {
        println("****** Basic tests ******")
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]",
            howmuch(1, 100))
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11][M: 163 B: 23 C: 18]]",
            howmuch(0, 200))

    }

}