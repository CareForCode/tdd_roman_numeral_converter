package roman_numeral_converter;

public enum RomanNumbers {
    ROMAN_1("I"), ROMAN_5("V");
    private String value;

    public String getValue() {
        return value;
    }

    RomanNumbers(String value) {
        this.value = value;
    }
}