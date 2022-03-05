package roman_numeral_converter;

public class RomanNumeralConverter {

    public static final String V = "V";
    public static final String I = "I";
    public static final String X = "X";

    public String convert(int value) {
        String result = "";
        if (value == 10) {
            return X;
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
            result += I.repeat(Math.max(0, remainder));
        }
        return result;
    }
}
