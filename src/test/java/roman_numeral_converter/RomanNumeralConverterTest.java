package roman_numeral_converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @ParameterizedTest
    @CsvSource({"1,I"})
    void convert1_getI(int number, String expectedRomanNumber) {
        assertThat(converter.convert(number)).isEqualTo(expectedRomanNumber);
    }

    @Test
    void convert2_getII() {
        assertThat(converter.convert(2)).isEqualTo("II");
    }

    @Test
    void convert3_getIII() {
        assertThat(converter.convert(3)).isEqualTo("III");
    }

}
