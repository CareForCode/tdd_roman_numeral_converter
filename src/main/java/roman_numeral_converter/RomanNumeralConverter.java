package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        if (value >= 10) {
            result.append(getRepeatedNumerals(value/10, RomanNumbers.X));
        } else if (value == 4) {
            result.append(RomanNumbers.I.getValue() + RomanNumbers.V.getValue());
        } else if (value == 9) {
            result.append(RomanNumbers.I.getValue() + RomanNumbers.X.getValue());
        } else {
            int remainder = value;
            if (value >= 5) {
                result.append(RomanNumbers.V.getValue());
                remainder -= 5;
            }
            result.append(getRepeatedNumerals(remainder, RomanNumbers.I));
        }
        return result.toString();
    }

    private String getRepeatedNumerals(int repeatInterval, RomanNumbers romanNumeral) {
        if (repeatInterval == 4) {

        }
        return romanNumeral.getValue().repeat(Math.max(0, repeatInterval));
    }
}
