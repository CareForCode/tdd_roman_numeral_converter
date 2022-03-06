package roman_numeral_converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static roman_numeral_converter.RomanNumeralConverter.convert;

public class RomanNumeralConverterTest {

    @ParameterizedTest
    @CsvSource({"1,I", "2,II", "3,III", "5,V", "6,VI", "8, VIII"})
    public void convertDecimalToRomanNumeral(int decimal, String expectedRoman) {
        assertThat(convert(decimal)).isEqualTo(expectedRoman);
    }
}
