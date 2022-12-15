package baseball;

import baseball.Controller.BaseballGameController;
import baseball.domain.Computer;
import baseball.domain.Hint;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Computer computer = new Computer();
        Hint hint = new Hint();
        BaseballGameController baseballGameController = new BaseballGameController(computer, hint);
        baseballGameController.run();
    }
}
