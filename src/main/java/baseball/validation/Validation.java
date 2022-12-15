package baseball.validation;

import static baseball.util.Constant.*;

import baseball.domain.GameCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validation {

    // 사용자의 정답 입력을 검증하는 메소드
    public static void validateUserAnswerInput(String input) {
        validateUserAnswerLenght3(input);
        validateUserAnswerConsistOf1To9(input);
        validateUserAnswerOverlap(input);
    }

    // 사용자의 재시작 및 종료 여부 입렵이 1과 2인지 검증하는 기능
    public static void validateUserRestartOrExitInput(String input) {
        if(!GameCommand.isValidCommand(input)) {
            throw new IllegalArgumentException(USER_COMMAND_ERROR);
        }
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

    private static void validateUserAnswerOverlap(String input) {
        List<String> answer = new ArrayList<>(Arrays.asList(input.split("")));
        Set<String> check = new HashSet<>(answer);
        if (check.size() != LENGTH) {
            throw new IllegalArgumentException(USER_ANSWER_OVERLAP_ERROR);
        }
    }
}
