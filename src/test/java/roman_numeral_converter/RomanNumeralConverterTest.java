package roman_numeral_converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    void convert1_getI() {
        assertThat(converter.convert(1)).isEqualTo(RomanNumeralConverter.ROMAN_1);
    }

    @Test
    void convert2_getII() {
        assertThat(converter.convert(2)).isEqualTo("II");
    }
}
