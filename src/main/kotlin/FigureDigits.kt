import java.lang.IllegalStateException

data class FigureDigits(val value: List<String>){
    init {
        if(value.size!=HEIGHT_CHARACTERS){
            throw IllegalStateException(ERROR_SIZE_ENTRY)
        }
    }

}