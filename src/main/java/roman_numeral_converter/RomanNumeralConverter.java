package roman_numeral_converter;

public class RomanNumeralConverter {

    public String convert(int value) {
        String result = "";
        if (value >= 10) {
            return getRepeatedNumerals(value/10, RomanNumbers.X);
        } else if (value == 4) {
            return RomanNumbers.I.getValue() + RomanNumbers.V.getValue();
        } else if (value == 9) {
            return RomanNumbers.I.getValue() + RomanNumbers.X.getValue();
        } else {
            int remainder = value;
            if (value >= 5) {
                result = RomanNumbers.V.getValue();
                remainder -= 5;
            }
            result += getRepeatedNumerals(remainder, RomanNumbers.I);
        }
        return result;
    }

    private String getRepeatedNumerals(int repeatInterval, RomanNumbers romanNumeral) {
        if (repeatInterval == 4) {

        }
        return romanNumeral.getValue().repeat(Math.max(0, repeatInterval));
    }
}
