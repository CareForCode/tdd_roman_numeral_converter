package roman_numeral_converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @ParameterizedTest
    @CsvSource({"1,I", "2,II", "3,III", "4, IIII", "5,V", "6,VI", "7,VII", "8,VIII", "9,VIIII", "10,X"})
    void convert1_getI(int number, String expectedRomanNumber) {
        assertThat(converter.convert(number)).isEqualTo(expectedRomanNumber);
    }

}
