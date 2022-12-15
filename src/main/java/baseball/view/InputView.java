package baseball.view;

import baseball.validation.Validation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    // 사용자가 응답하는 기능
    public static String userAnswer() {
        String input = Console.readLine();
        Validation.validateUserAnswerInput(input);
        return input;
    }

    // 사용자가 재시작 및 종료 여부를 입력하는 기능
    public static String restartOrExit() {
        String input = Console.readLine();
        Validation.validateUserRestartOrExitInput(input);
        return input;
    }
}
