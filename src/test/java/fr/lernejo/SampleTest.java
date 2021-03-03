package fr.lernejo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "1, 1, 2",
        "2, 3, 5",
        "-5, 0, -5",
        "8, -3, 5"
    })
    void addTest(int a, int b, int expected) {
        int result = new Sample().op(Sample.Operation.ADD, a, b);

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1, 1",
        "2, 3, 6",
        "-5, 0, 0",
        "8, -3, -24"
    })
    void multTest(int a, int b, int expected) {
        int result = new Sample().op(Sample.Operation.MULT, a, b);

        assertThat(result).isEqualTo(expected);
    }
}
