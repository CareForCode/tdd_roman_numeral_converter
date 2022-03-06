package roman_numeral_converter;

public class RomanNumeralConverter {
    public static String convert(int decimal) {
        StringBuilder result = new StringBuilder();
        for (NumeralToDecimal value : NumeralToDecimal.values()) {
            while (decimal >= value.decimal) {
                result.append(value.romanNumeral);
                decimal -= value.decimal;
            }
        }
        return result.toString();
    }

    enum NumeralToDecimal {
        TEN(10,"X"),
        FIVE(5,"V"),
        ONE(1, "I");

        private final int decimal;
        private final String romanNumeral;

        NumeralToDecimal(int decimal, String romanNumeral) {
            this.decimal = decimal;
            this.romanNumeral = romanNumeral;
        }
    }
}
