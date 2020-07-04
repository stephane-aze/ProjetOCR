
import java.io.File
const val ERROR_LENGTH_ENTRIES_FILE="Number of entries in file shouldn't be largest than 100"
const val MAX_LENGTH_ENTRIES_FILE=100

class FileToParser(_file: File): FileInterface {
    private var file: File = _file
    private lateinit var entries: List<EntryOfFile>
    init {
        createListEntry()
        if (entries.size>MAX_LENGTH_ENTRIES_FILE){
            throw IllegalStateException(ERROR_LENGTH_ENTRIES_FILE)
        }
    }

    override fun getAllLines():List<String> = file.useLines { it.toList() }

    private fun createListEntry(){
        val list = mutableListOf<EntryOfFile>()
        val allLines: List<String> =getAllLines()
        for (indicesLine in getAllLines().indices step (4) ){
            list.add(EntryOfFile(listOf(
                allLines[indicesLine],
                allLines[indicesLine+1],
                allLines[indicesLine+2],
                allLines[indicesLine+3]
                ))
            )
        }
        entries=list
    }


    fun getEntries(): List<EntryOfFile> {
        return entries
    }


    override fun getEntry(int: Int): List<FigureDigits> = entries[int].getAllFigureDigits()


}
