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
        THOUSAND(1000,"M"),
        NINE_HUNDRED(900,"CM"),
        FIVE_HUNDRED(500,"D"),
        FOUR_HUNDRED(400,"CD"),
        HUNDRED(100,"C"),
        NINETY(90,"XC"),
        FIFTY(50,"L"),
        FOURTY(40,"XL"),
        TEN(10,"X"),
        NINE(9,"IX"),
        FIVE(5,"V"),
        FOUR(4,"IV"),
        ONE(1, "I");

        private final int decimal;
        private final String romanNumeral;

        NumeralToDecimal(int decimal, String romanNumeral) {
            this.decimal = decimal;
            this.romanNumeral = romanNumeral;
        }
    }
}
