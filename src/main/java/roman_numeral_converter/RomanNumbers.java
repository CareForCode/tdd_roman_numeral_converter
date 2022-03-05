package roman_numeral_converter;

public enum RomanNumbers {
    I("I"),
    V("V"),
    X("X");

    private String value;

    public String getValue() {
        return value;
    }

    RomanNumbers(String value) {
        this.value = value;
    }
}