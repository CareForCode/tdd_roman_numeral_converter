package roman_numeral_converter;

public enum RomanNumber {
    I("I", 1),
    V("V", 5),
    X("X", 10);

    private final String romanString;
    private final int arabicValue;

    RomanNumber(String romanString, int arabicValue) {
        this.romanString = romanString;
        this.arabicValue = arabicValue;
    }

    public String getRomanString() {
        return romanString;
    }

    public int getArabicValue() {
        return arabicValue;
    }
}