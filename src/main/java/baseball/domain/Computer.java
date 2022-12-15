package baseball.domain;

import static baseball.domain.util.Constant.*;

import java.util.List;

public class Computer {

    private List<Integer> answerNumber;

    // 정답의 길이가 3인지 체크하는 기능
    private boolean checkLength3() {
        return answerNumber.size() == LENGTH;
    }

    private boolean checkNumberConsistOf1To9(int num) {
        return MIN_NUMBER <= num && num <= MAX_NUMBER;
    }

    private boolean checkOverlap(int num) {
        return answerNumber.contains(num);
    }
}
