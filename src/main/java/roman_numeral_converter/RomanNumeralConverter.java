package roman_numeral_converter;

public class RomanNumeralConverter {

    public static final String V = "V";
    public static final String I = "I";

    public String convert(int value) {
        String result;
        if (value >= 5) {
            result =  V;
        } else {
            result = I.repeat(Math.max(0, value));
        }
        return result;
    }
}
