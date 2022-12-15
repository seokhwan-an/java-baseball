package baseball.validation;

import static baseball.util.Constant.*;

public class Validation {

    // 사용자의 정답 입력을 검증하는 메소드
    public static void validateUserAnswerInput(String input) {
        validateUserAnswerLenght3(input);
        validateUserAnswerConsistOf1To9(input);
    }

    // 사용자의 정답 입력의 길이가 3인지 검증하는 기능
    private static void validateUserAnswerLenght3(String input) {
        if (input.length() != LENGTH) {
            throw new IllegalArgumentException(USER_ANSWER_LENGTH_ERROR);
        }
    }

    // 사용자의 정답 입력값이 1과 9사이의 수로 구성되어있는지 검증하는 기능
    private static void validateUserAnswerConsistOf1To9(String input) {
        if (!input.matches(USER_ANSWER_REGEX)) {
            throw new IllegalArgumentException(USER_ANSWER_CONSIST_OF_1_TO_9_ERROR);
        }
    }
}
