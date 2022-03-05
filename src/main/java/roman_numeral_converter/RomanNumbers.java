package roman_numeral_converter;

public enum RomanNumbers {
    V("V"), I("I"), X("X");
    private String value;

    public String getValue() {
        return value;
    }

    RomanNumbers(String value) {
        this.value = value;
    }
}