package roman_numeral_converter;

public class RomanNumeralConverter {
    public static String convert(int decimal) {
        StringBuilder result = new StringBuilder();
        for (NumeralToDecimal value : NumeralToDecimal.values()) {
            if (decimal >= value.decimal) {
                result.append(value.romanNumeral);
                decimal -= value.decimal;
            }
        }
        for (int i = 0; i < decimal; i++) {
            result.append("I");
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
