import java.io.File

class OCR(text: String){
    private val file: File
    init {
        val input = File(text)
        if (!input.exists()) {
            throw IllegalArgumentException("Error: the file \"$text\" is not exist")
        }
        file=input
    }

    fun parse():String {
        val listEntries = FileToParser(file).getEntries()
        val result: String
        val listEntryParsed = mutableListOf<String>()
        for (i in listEntries.indices) {
            var entryParsed = ""
            val data = FileToParser(file).getEntry(i)
            data.forEach { entryParsed += checkDigits(it) }
            listEntryParsed.add(checkResult(entryParsed))
        }
        result=listEntryParsed.joinToString(separator = "\n")
        return result
    }
    fun checkDigits(figure:FigureDigits):String{
        if(digitsMap[figure]==null) return DIGIT_ILLEGIBLE
        return digitsMap[figure].toString()
    }

    private fun checkResult(result: String):String {
        return result.plus(getSignStatus(result))
    }

    fun getSignStatus(result: String): String {
        if (isLegible(result)) {
            return " $SIGNAL_ILLEGIBLE"
        }
        if (!isValid(result)) {
            return " $SIGNAL_NO_VALID"
        }
        return ""
    }
    private fun isLegible(result: String) = result.contains(DIGIT_ILLEGIBLE)

    fun isValid(result: String):Boolean {
        return calculateForCheckSum(result).rem(NUMBER_FOR_CHECKSUM)==0
    }

    private fun calculateForCheckSum(result: String): Int {
        val stepDigit=1
        return result.chunked(stepDigit).map { it.toInt() }
            .reduceRightIndexed { index, current, previous -> (POSITION_MAX_DIGITS - index) * current + previous }
    }

}