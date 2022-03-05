package roman_numeral_converter;

public enum RomanNumber {
    I("I", 1),
    V("V", 5),
    X("X", 10),
    UNKNOWN("",-1);

    private final String romanString;
    private final int arabicValue;

    RomanNumber(String romanString, int arabicValue) {
        this.romanString = romanString;
        this.arabicValue = arabicValue;
    }

    private static RomanNumber ofChar(char c) {
        for (RomanNumber element : values()) {
            if (element.romanString.equalsIgnoreCase(String.valueOf(c))) {
                return element;
            }
        }
        return UNKNOWN;
    }

    public static RomanNumber ofNumber(int number) {
        for (RomanNumber element : values()) {
            if (element.arabicValue == number) {
                return element;
            }
        }
        return UNKNOWN;
    }

    public static int convertCharToIntValue(char c) {
        return ofChar(c).arabicValue;
    }

    public String getRomanString() {
        return romanString;
    }

    public int getArabicValue() {
        return arabicValue;
    }
}