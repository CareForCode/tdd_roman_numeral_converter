package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value == 5) {
            return RomanNumbers.FIVE.getValue();
        }
        for (int i = 0; i < value; i++) {
            result.append(RomanNumbers.ONE.getValue());
        }
        return result.toString();
    }
}
