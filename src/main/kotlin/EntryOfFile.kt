import java.lang.IllegalStateException

const val ERROR_SIZE_ENTRY="Number line characters should be 4"
const val ERROR_LENGTH_ENTRY="Number of characters by line should be 27"
const val WIDTH_CHARACTERS=27
const val HEIGHT_CHARACTERS=4
const val LAST_LINE=3
class EntryOfFile(line: List<String>) {
    private var lineEntryOfFile: List<String>
    init {
        if(line.size!=HEIGHT_CHARACTERS){
            throw IllegalStateException(ERROR_SIZE_ENTRY)
        }

        for (element in 0 until LAST_LINE){      //The last line is empty also there is not characters
            if(line[element].length!=WIDTH_CHARACTERS){
                throw IllegalStateException(ERROR_LENGTH_ENTRY)
            }
        }
        lineEntryOfFile=line
    }
    private fun getFigureDigit(int: Int): FigureDigits{
        val listDigit= mutableListOf<String>()

        for (i in 0 until LAST_LINE){
            val characterLineSplit=lineEntryOfFile[i].chunked(WIDTH_DIGIT)
            listDigit.add(characterLineSplit[int])
        }
        listDigit.add("")
        return FigureDigits(listDigit)
    }
    fun getAllFigureDigits(): List<FigureDigits>{
        val listAllDigits= mutableListOf<FigureDigits>()

        for (i in POSITION_MIN_DIGITS until POSITION_MAX_DIGITS){

            listAllDigits.add(getFigureDigit(i))

        }

        return listAllDigits
    }
}