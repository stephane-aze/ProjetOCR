import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EntryOfFileTest {

    private val list:List<String> = listOf(  "    _  _     _  _  _  _  _ ",
                                             "  | _| _||_||_ |_   ||_||_|",
                                             "  ||_  _|  | _||_|  ||_| _|",
                                             "")
    @Test
    fun shouldReturnListDigits() {
        //GIVEN
        val entryOfFile = EntryOfFile(list)
        //WHEN
        val res=entryOfFile.getAllFigureDigits()
        //THEN
        val expected = listOf(
            digitsMapReverse.getValue(1),
            digitsMapReverse.getValue(2),
            digitsMapReverse.getValue(3),
            digitsMapReverse.getValue(4),
            digitsMapReverse.getValue(5),
            digitsMapReverse.getValue(6),
            digitsMapReverse.getValue(7),
            digitsMapReverse.getValue(8),
            digitsMapReverse.getValue(9)
        )
        assertEquals(expected,res)

    }
}