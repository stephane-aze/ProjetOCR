import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class OCRTest {

    //USER STORY 1
    @Test
    fun shouldToParse() {
        //GIVEN
        val test = OCR("OCR-test.txt")
        //WHEN
        val res = test.parse()
        //THEN
        val expected="123456789"
        assertEquals(expected,res)

    }
    @Test
    fun shouldReturnValueFigure(){
        //GIVEN
        val figure0=digitsMapReverse.getValue(0)

        //WHEN
        val res = OCR("OCR-test.txt").checkDigits(figure0)
        //THEN
        val expected ="0"
        assertEquals(expected,res)
    }
    @Test
    fun shouldNotReturnValueFigure(){
        //GIVEN
        val figureErr0=FigureDigits(listOf( " _ ",
                                            "  |",
                                            "|_|",
                                            "")
        )

        //WHEN
        val res = OCR("OCR-test.txt").checkDigits(figureErr0)
        //THEN
        val expected =DIGIT_ILLEGIBLE
        assertEquals(expected,res)
    }
    @Test
    fun shouldWriteDigitIllegible(){
        //GIVEN
        val text="?12345678"

        //WHEN
        val res = OCR("OCR-test.txt").getSignStatus(text)
        //THEN
        val expected =" $SIGNAL_ILLEGIBLE"
        assertEquals(expected,res)
    }
    @Test
    fun shouldWriteDigitError(){
        //GIVEN
        val text="664371495"

        //WHEN
        val res = OCR("OCR-test.txt").getSignStatus(text)
        //THEN
        val expected =" $SIGNAL_NO_VALID"
        assertEquals(expected,res)
    }
    @Test
    fun shouldReturnFalseForCheckSum(){
        //GIVEN
        val text="664371495"
        //WHEN
        val res = OCR("OCR-test.txt").isValid(text)
        //THEN
        assertFalse(res)
    }

}