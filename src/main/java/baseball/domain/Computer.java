package baseball.domain;

import static baseball.util.Constant.*;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Integer> answerNumber;

    public Computer() {
        answerNumber = new ArrayList<>();
    }

    public List<Integer> createAnswer() {
        while(!checkLength3()) {
            int num = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (checkNumberConsistOf1To9(num) && checkOverlap(num)) {
                continue;
            }
            answerNumber.add(num);
        }
        return answerNumber;
    }

    public void init() {
        answerNumber = new ArrayList<>();
    }

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
