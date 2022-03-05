package roman_numeral_converter;

public class RomanNumeralConverter {
    public static final String ROMAN_1 = "I";

    public String convert(int value) {
        String result = "";
        for (int i = 0; i < value; i++) {
            result += ROMAN_1;
        }
        return result;
    }
}
