package stringaddcalculator.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.DisplayName

internal class StringAddCalculatorTest {

    @Test
    @DisplayName("빈 문자열이나 null 값이 들어올 경우엔 0을 리턴한다")
    fun calculate() {
        val expression: String? = null
        val result = StringAddCalculator().calculate(expression)
        assertThat(result).isEqualTo(0)
    }

    @Test
    @DisplayName("커스텀 입력을 넣었을 때 문자열을 계산한다")
    fun calculateCustom() {
        val result = StringAddCalculator().calculate("//;\n1;2;3")
        assertThat(result).isEqualTo(6)
    }

    @Test
    @DisplayName("문자열을 계산한다")
    fun calculateDefault() {
        val result = StringAddCalculator().calculate("1:2,3")
        assertThat(result).isEqualTo(6)
    }

    @Test
    @DisplayName("숫자 하나만 있을 때 계산한다")
    fun oneNumber() {
        val result = StringAddCalculator().calculate("1")
        assertThat(result).isEqualTo(1)
    }
}
