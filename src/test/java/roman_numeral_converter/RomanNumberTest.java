package roman_numeral_converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @ParameterizedTest
    @CsvSource({"1,I"})
    void ofNumber_1_isI(int arabicNumber, char expectedRomanNumber) {
        assertThat(RomanNumber.ofNumber(1)).isEqualByComparingTo(RomanNumber.ofChar(expectedRomanNumber));
    }
}
