package rin.ked.mas

class Interpreter {
    companion object {
        fun parse(expression: String): Any {
            if (expression.contains("+")) {
                return expression.replace("\\s".toRegex(), "")
                    .split("+")
                    .sumOf { it.toBigDecimal() }
            }
            return expression.replace("\\s".toRegex(), "").toBigDecimal()
        }
    }
}