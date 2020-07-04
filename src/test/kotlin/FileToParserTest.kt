import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File
//const val entry=EntryOfFile(digitsMap.,)
internal class FileToParserTest {
    //GIVEN
    private val fileToParser= FileToParser(File("OCR-test.txt"))

    @Test
    fun shouldReturnAllLinesOfFile() {
        //GIVEN
        val file=fileToParser
        //WHEN
        val res: List<String> = file.getAllLines()
        //THEN
        val expected:List<String> = listOf( "    _  _     _  _  _  _  _ ",
                                            "  | _| _||_||_ |_   ||_||_|",
                                            "  ||_  _|  | _||_|  ||_| _|",
                                            "")
        assertEquals(expected,res)
    }


}