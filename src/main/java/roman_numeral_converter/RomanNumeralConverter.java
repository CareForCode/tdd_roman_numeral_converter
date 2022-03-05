package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value >= 10) {
            appendRepeatedNumbers(result, value/10, RomanNumber.X);
        } else if (value == 4) {
            result.append(RomanNumber.I.getValue() + RomanNumber.V.getValue());
        } else if (value == 9) {
            result.append(RomanNumber.I.getValue() + RomanNumber.X.getValue());
        } else {
            int remainder = value;
            if (value >= 5) {
                result.append(RomanNumber.V.getValue());
                remainder -= 5;
            }
            appendRepeatedNumbers(result, remainder, RomanNumber.I);
        }
        return result.toString();
    }

    private void appendRepeatedNumbers(StringBuilder result, int remainder, RomanNumber romanNumber) {
        result.append(getRepeatedNumerals(remainder, romanNumber));
    }

    private String getRepeatedNumerals(int repeatInterval, RomanNumber romanNumeral) {
        if (repeatInterval == 4) {

        }
        return romanNumeral.getValue().repeat(Math.max(0, repeatInterval));
    }
}
