package roman_numeral_converter;

public class RomanNumeralConverter {

    public static final String V = "V";
    public static final String I = "I";
    public static final String X = "X";

    public String convert(int value) {
        String result = "";
        if (value >= 10) {
            return X.repeat(Math.max(0, value/10));
        } else if (value == 4) {
            return I + V;
        } else if (value == 9) {
            return I + X;
        } else {
            int remainder = value;
            if (value >= 5) {
                result =  V;
                remainder -= 5;
            }
            result += getRepeatedNumerals(result, remainder, I);
        }
        return result;
    }

    private String getRepeatedNumerals(String result, int repeatInterval, String romanNumeral) {
        return romanNumeral.repeat(Math.max(0, repeatInterval));
    }
}
