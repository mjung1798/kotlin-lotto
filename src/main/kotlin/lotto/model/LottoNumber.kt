package lotto.model

class LottoNumber private constructor(private val value: Int) {
    companion object {
        private const val MINIMUM_NUMBER = 1
        private const val MAXIMUM_NUMBER = 45
        private val NUMBERS: Map<Int, LottoNumber> = (MINIMUM_NUMBER..MAXIMUM_NUMBER).associateWith(::LottoNumber)

        fun from(value: Int): LottoNumber {
            return return NUMBERS[value] ?: throw IllegalArgumentException("not exist number")
        }
    }

    override fun toString(): String {
        return "$value"
    }
}