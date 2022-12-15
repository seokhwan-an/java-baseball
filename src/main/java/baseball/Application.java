package baseball;

import baseball.Controller.BaseballGameController;
import baseball.domain.Computer;
import baseball.domain.Result;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Computer computer = new Computer();
        Result result = new Result();
        BaseballGameController baseballGameController = new BaseballGameController(computer, result);
        baseballGameController.run();
    }
}
