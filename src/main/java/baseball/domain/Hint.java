package baseball.domain;

import static baseball.util.Constant.*;

import java.util.List;

public class Hint {

    private int strike;
    private int ball;

    public Hint() {
        strike = 0;
        ball = 0;
    }

    // 힌트를 제공하는 기능
    public int[] giveHint(List<Integer> answer, String userInput) {
        for(int i = 0; i < LENGTH; i++) {
            if(answer.get(i) == userInput.charAt(i) - '0') {
                strike++;
            } else if(answer.contains(userInput.charAt(i) - '0')) {
                ball++;
            }
        }
        return new int[] {strike, ball};
    }

    // 정답인지 판별하는 기능
    public boolean isAnswer() {
        if(strike == ANSWER) {
            System.out.println(ANSWER_MENT);
            return true;
        }
        return false;
    }

    public void init() {
        strike = 0;
        ball = 0;
    }
}
