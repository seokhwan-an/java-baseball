package baseball.Controller;

import baseball.domain.Computer;
import baseball.domain.GameCommand;
import baseball.domain.Hint;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGameController {

    private Computer computer;
    private Hint hint;

    public BaseballGameController(Computer computer, Hint hint) {
        this.computer = computer;
        this.hint = hint;
    }

    // 게임을 진행하는 기능
    public void run() {
        do {
            OutputView.printStart();
            List<Integer> answer = computer.createAnswer();
            round(answer);
        } while (GameCommand.isRestart(InputView.restartOrExit()));
    }

    // 라운드 진행
    private void round(List<Integer> answer) {
        do {
            hint.init();
            String userAnswer = InputView.userAnswer();
            int[] result = hint.giveHint(answer, userAnswer);
            OutputView.printHint(result);
        } while(hint.isAnswer());
    }
}
