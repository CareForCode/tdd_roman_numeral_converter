package roman_numeral_converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static roman_numeral_converter.RomanNumeralConverter.convert;

public class RomanNumeralConverterTest {

    @ParameterizedTest
    @CsvSource({
            "1,I",
            "2,II",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "8, VIII",
            "9, IX",
            "10,X",
            "12,XII",
            "18,XVIII",
            "29,XXIX",
            "30,XXX",
            "50,L",
            "80,LXXX",
            "100,C",
            "294,CCXCIV",
            "500,D",
            "1000,M",
    })
    public void convertDecimalToRomanNumeral(int decimal, String expectedRoman) {
        assertThat(convert(decimal)).isEqualTo(expectedRoman);
    }
}
