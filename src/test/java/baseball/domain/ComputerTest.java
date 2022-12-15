package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    private Computer computer = new Computer();

    @DisplayName("정답의 길이가 3인지 검증하는 테스트")
    @Test
    void checkAnswerLength3() {
        // given
        List<Integer> answer = computer.createAnswer();

        // then
        Assertions.assertThat(answer.size()).isEqualTo(3);
    }
}