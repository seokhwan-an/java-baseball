package baseball.validation;

import static baseball.util.Constant.*;

public class Validation {

    // 사용자의 정답 입력을 검증하는 메소드
    public static void validateUserAnswerInput(String input) {
        validateUserAnswerLenght3(input);
    }

    // 사용자의 정답 입력의 길이가 3인지 검증하는 메소드
    private static void validateUserAnswerLenght3(String input) {
        if (input.length() != LENGTH) {
            throw new IllegalArgumentException(USER_ANSWER_LENGTH_ERROR);
        }
    }
}
