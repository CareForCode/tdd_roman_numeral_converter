package roman_numeral_converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @ParameterizedTest
    @CsvSource({"1,I", "5,V", "10,X"})
    void createRomanNumberFromChar(int arabicNumber, char expectedRomanNumber) {
        assertThat(RomanNumber.ofNumber(arabicNumber)).isEqualByComparingTo(RomanNumber.ofChar(expectedRomanNumber));
    }

    @Test
    void getNextRomanNumber_I_isV() {
        assertThat(RomanNumber.I.getNextRomanNumber()).isEqualTo(RomanNumber.V);
    }

    @Test
    void getNextRomanNumber_V_isX() {
        assertThat(RomanNumber.V.getNextRomanNumber()).isEqualTo(RomanNumber.X);
    }

    @Test
    void getNextRomanNumber_X_isX() {
        assertThat(RomanNumber.X.getNextRomanNumber()).isEqualTo(RomanNumber.X);
    }
}
