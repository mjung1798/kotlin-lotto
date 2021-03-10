package lotto.domain

import java.lang.IllegalArgumentException

data class LottoNumber(private val number: Int) {
    init {
        require(isValidRange(number)) { throw IllegalArgumentException(" $number 로또 숫자에 포함되지 않는 숫자입니다") }
    }

    private fun isValidRange(number: Int): Boolean {
        return number in 1..45
    }
}
