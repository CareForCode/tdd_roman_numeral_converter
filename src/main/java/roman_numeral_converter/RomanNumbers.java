package roman_numeral_converter;

public enum RomanNumbers {
    ONE("I"),
    FIVE("V");

    private final String value;

    public String getValue() {
        return value;
    }

    RomanNumbers(String value) {
        this.value = value;
    }
}