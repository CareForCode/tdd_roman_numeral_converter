package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value >= 10) {
            appendRepeatedNumbers(result, value/10, RomanNumber.X);
        } else if (value == 9) {
            result.append(RomanNumber.I.getRomanString())
                    .append(RomanNumber.X.getRomanString());
        } else {
            int remainder = value;
            if (value >= 5) {
                result.append(RomanNumber.V.getRomanString());
                remainder -= 5;
            }
            appendRepeatedNumbers(result, remainder, RomanNumber.I);
        }
        return result.toString();
    }

    private void appendRepeatedNumbers(StringBuilder result, int repeatInterval, RomanNumber romanNumber) {
        if (repeatInterval == 4) {
            result.append(romanNumber);
            result.append(romanNumber.getNextRomanNumber());
        } else {
            result.append(romanNumber.getRomanString().repeat(Math.max(0, repeatInterval)));
        }
    }

}
