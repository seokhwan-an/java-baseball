package baseball.validation;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidationTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @DisplayName("사용자의 정답 입력의 길이가 3이 아니면 에러가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1", "12", "1234", ""})
    void checkUserAnswerLenght3(String input) {
        assertThatThrownBy(()-> Validation.validateUserAnswerInput(input))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(ERROR_MESSAGE);
    }

    @DisplayName("사용자의 정답 입력이 1과 9사이의 수 이외의 값이 있으면 에러가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"r12", "!sf", "ㄱ2ㄴ", "?!ㄴ", " ", ""})
    void checkUserAnswerConsistOf1To9(String input) {
        assertThatThrownBy(() -> Validation.validateUserAnswerInput(input))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(ERROR_MESSAGE);
    }

    @DisplayName("사용자의 정답 입력이 서로 다른 수로 구성되어 있지 않으면 에러가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"111", "122", "221", "121"})
    void checkUserAnswerOverlap(String input) {
        assertThatThrownBy(() -> Validation.validateUserAnswerInput(input))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(ERROR_MESSAGE);
    }
}