
const val POSITION_MIN_DIGITS = 0
const val POSITION_MAX_DIGITS = 9
const val DIGIT_ILLEGIBLE = "?"
const val SIGNAL_ILLEGIBLE = "ILL"
const val SIGNAL_NO_VALID = "ERR"
const val WIDTH_DIGIT=3
const val FILENAME = "OCR.txt"
const val NUMBER_FOR_CHECKSUM = 11


val digitsMap = mapOf(
    FigureDigits(listOf(" _ ",
                        "| |",
                        "|_|",
                        "")
    ) to 0,
    FigureDigits(listOf("   ",
                        "  |",
                        "  |",
                        "")
    ) to 1,
    FigureDigits(listOf(" _ ",
                        " _|",
                        "|_ ",
                        "")
    ) to 2,
    FigureDigits(listOf(" _ ",
                        " _|",
                        " _|",
                        "")
    ) to 3,
    FigureDigits(listOf("   ",
                        "|_|",
                        "  |",
                        "")
    )to 4,
    FigureDigits(listOf(" _ ",
                        "|_ ",
                        " _|",
                        "")
    )to 5,
    FigureDigits(listOf(" _ ",
                        "|_ ",
                        "|_|",
                        "")
    )to 6,
    FigureDigits(listOf(" _ ",
                        "  |",
                        "  |",
                        "")
    )to 7,
    FigureDigits(listOf(" _ ",
                        "|_|",
                        "|_|",
                        "")
    )to 8,
    FigureDigits(listOf(" _ ",
                        "|_|",
                        " _|",
                        "")
    )to 9
)
//Use for tests
val digitsMapReverse = mapOf(
    0 to FigureDigits(listOf(" _ ",
        "| |",
        "|_|",
        "")
    ) ,
    1 to FigureDigits(listOf("   ",
        "  |",
        "  |",
        "")
    ),
    2 to FigureDigits(listOf(" _ ",
                             " _|",
                             "|_ ",
                             "")
    ),
    3 to FigureDigits(listOf(" _ ",
                             " _|",
                             " _|",
                             "")
    ),
    4 to FigureDigits(listOf("   ",
                             "|_|",
                             "  |",
                             "")
    ) ,
    5 to FigureDigits(listOf(" _ ",
                             "|_ ",
                             " _|",
                             "")
    ),
    6 to FigureDigits(listOf(" _ ",
                             "|_ ",
                             "|_|",
                             "")
    ) ,
    7 to FigureDigits(listOf(" _ ",
                             "  |",
                             "  |",
                             "")
    ),
    8 to FigureDigits(listOf(" _ ",
                             "|_|",
                             "|_|",
                             "")
    ) ,
    9 to FigureDigits(listOf(" _ ",
                             "|_|",
                             " _|",
                             "")
    )
)
