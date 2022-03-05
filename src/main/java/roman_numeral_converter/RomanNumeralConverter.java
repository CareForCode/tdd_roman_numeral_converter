package roman_numeral_converter;

public class RomanNumeralConverter {

    public static final String ROMAN_5 = "V";
    public static final String ROMAN_1 = "I";

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value == 5) {
            return ROMAN_5;
        }
        result.append(ROMAN_1.repeat(Math.max(0, value)));
        return result.toString();
    }
}
