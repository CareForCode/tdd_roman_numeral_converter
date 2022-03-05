package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value >= 10) {
            appendRepeatedNumbers(result, value/10, RomanNumber.X);
        } else if (value == 4) {
            result.append(RomanNumber.I.getValue())
                    .append(RomanNumber.V.getValue());
        } else if (value == 9) {
            result.append(RomanNumber.I.getValue())
                    .append(RomanNumber.X.getValue());
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
        if (remainder == 4) {

        }
        result.append(romanNumber.getValue().repeat(Math.max(0, remainder)));
    }

}
