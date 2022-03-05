package roman_numeral_converter;

public class RomanNumeralConverter {

    public static final String V = "V";
    public static final String I = "I";

    public String convert(int value) {
        if (value == 5) {
            return V;
        } else if (value == 4) {
            return I + V;
        }
        return I.repeat(Math.max(0, value));
    }
}
