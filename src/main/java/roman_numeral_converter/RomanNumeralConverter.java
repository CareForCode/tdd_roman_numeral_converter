package roman_numeral_converter;

public class RomanNumeralConverter {
    public static String convert(int decimal) {
        String result = "";
        for (int i = 0; i < decimal; i++) {
            result += "I";
        }
        return result;
    }
}
