package baseball.view;

import static baseball.util.Constant.*;

import baseball.validation.Validation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    // 사용자가 응답하는 기능
    public static String userAnswer() {
        System.out.print(USER_ANSWER_QUESTION);
        String input = Console.readLine();
        Validation.validateUserAnswerInput(input);
        return input;
    }

    // 사용자가 재시작 및 종료 여부를 입력하는 기능
    public static String restartOrExit() {
        System.out.print(USER_GAME_RESTART_EXIT_QUESTION);
        String input = Console.readLine();
        Validation.validateUserRestartOrExitInput(input);
        return input;
    }
}
