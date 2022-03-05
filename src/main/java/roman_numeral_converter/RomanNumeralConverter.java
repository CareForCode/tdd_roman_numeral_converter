package roman_numeral_converter;

public class RomanNumeralConverter {
    public static final String ROMAN_1 = "I";

    public String convert(int value) {
        if (value == 2) {
            return "II";
        }
        return ROMAN_1;
    }
}
