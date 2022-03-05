package roman_numeral_converter;

public enum RomanNumber {
    I("I"),
    V("V"),
    X("X");

    private String value;

    public String getValue() {
        return value;
    }

    RomanNumber(String value) {
        this.value = value;
    }
}