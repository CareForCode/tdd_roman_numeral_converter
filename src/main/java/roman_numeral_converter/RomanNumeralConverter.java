package roman_numeral_converter;

public class RomanNumeralConverter {
    public static final String ROMAN_1 = "I";

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value == 5) {
            return "V";
        }
        for (int i = 0; i < value; i++) {
            result.append(ROMAN_1);
        }
        return result.toString();
    }
}
