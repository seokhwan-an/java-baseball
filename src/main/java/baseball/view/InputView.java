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
}
