package roman_numeral_converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @Test
    void ofNumber_1_isI() {
        assertThat(RomanNumber.ofNumber(1)).isEqualByComparingTo(RomanNumber.I);
    }
}
