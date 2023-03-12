package rin.ked.mas

import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertEquals

class InterpreterTests {
    @Test
    fun `parse digits`() {
        for (i in 0..9) testInterpreter(i.toString(), i)
    }

    @Test
    fun `omit spaces`() {
        testInterpreter(" - 10", "-10")
    }

    @Test
    fun `parse float`() {
        testInterpreter(" 3. 1415", "3.1415")
        testInterpreter("3.1415e-3", "3.1415e-3")
    }

    @Test
    fun `parse addition`() {
        testInterpreter("1 + 2", 3)
    }

    private fun testInterpreter(expression: String, value: Any) {
        assertEquals(BigDecimal(value.toString()), Interpreter.parse(expression))
    }
}