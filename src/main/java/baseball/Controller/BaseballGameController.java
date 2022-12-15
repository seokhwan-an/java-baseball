package baseball.Controller;

import baseball.domain.Computer;
import baseball.domain.GameCommand;
import baseball.domain.Result;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseballGameController {

    private Computer computer;
    private Result result;

    public BaseballGameController(Computer computer, Result result) {
        this.computer = computer;
        this.result = result;
    }

    // 게임을 진행하는 기능
    public void run() {
        OutputView.printStart();
        do {
            computer.init();
            List<Integer>answer = computer.createAnswer();
            round(answer);
        } while (GameCommand.isRestart(InputView.restartOrExit()));
    }

    // 라운드 진행
    private void round(List<Integer> answer) {
        do {
            result.init();
            String userAnswer = InputView.userAnswer();
            int[] result = this.result.giveHint(answer, userAnswer);
            OutputView.printHint(result);
        } while(result.isNotAnswer());
    }
}
