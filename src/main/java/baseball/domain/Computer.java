package baseball.domain;

import java.util.List;

public class Computer {

    private List<Integer> answerNumber;

    // 정답의 길이가 3인지 체크하는 기능
    private boolean checkLength3() {
        return answerNumber.size() == 3;
    }
}
