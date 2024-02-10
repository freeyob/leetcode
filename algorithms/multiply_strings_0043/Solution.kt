package multiply_strings_0043

class Solution {
    fun multiply(num1: String, num2: String): String {
        if (num1.length == 1 && num1.toInt() == 0) {
            return "0"
        }
        if (num2.length == 1 && num2.toInt() == 0) {
            return "0"
        }
        var result: String = "0"
        var move = ""
        for (num1Index in num1.lastIndex downTo 0) {
            var bit = 0
            var lineProduct = ""
            for (num2Index in num2.lastIndex downTo 0) {
                val product = num1[num1Index].digitToInt() * num2[num2Index].digitToInt() + bit
                val quotient = product / 10
                val remainder = product % 10
                bit = quotient
                lineProduct = remainder.toString() + lineProduct
            }
            if (bit > 0) {
                lineProduct = bit.toString() + lineProduct
            }
            lineProduct += move
            move += "0"
            result = sum(result, lineProduct)
        }
        return result
    }

    private fun sum(num1: String, num2: String): String {
        val lastIndex = maxOf(num1.lastIndex, num2.lastIndex)
        var bit = 0
        var result = ""
        for (i in 0..lastIndex) {
            val d1 =
                    if (i > num1.lastIndex) {
                        0
                    } else {
                        num1[num1.lastIndex - i].digitToInt()
                    }
            val d2 =
                    if (i > num2.lastIndex) {
                        0
                    } else {
                        num2[num2.lastIndex - i].digitToInt()
                    }
            val sum = d1 + d2 + bit
            val remainder = sum % 10
            bit = sum / 10
            result = remainder.toString() + result
        }
        if (bit > 0) {
            result = bit.toString() + result
        }
        return result
    }
}