package roman_numeral_converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    @Test
    void initConverter() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
    }

    @Test
    void convert1_getI() {
        RomanNumeralConverter converter = new RomanNumeralConverter();

        assertThat(converter.convert(1)).isEqualTo(RomanNumeralConverter.ROMAN_1);
    }

    @Test
    void convert2_getII() {
        RomanNumeralConverter converter = new RomanNumeralConverter();

        assertThat(converter.convert(2)).isEqualTo("II");
    }
}
