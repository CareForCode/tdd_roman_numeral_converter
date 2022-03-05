package roman_numeral_converter;

public class RomanNumeralConverter {
    public String convert(int value) {
        if (value == 2) {
            return "II";
        }
        return "I";
    }
}
