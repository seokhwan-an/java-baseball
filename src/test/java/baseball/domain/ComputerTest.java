package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

    @DisplayName("정답이 숫자 1과 9사이의 수로 구성되었는지 테스트")
    @Test
    void checkAnswerConsistOf1To9() {
        // given
        List<Integer> answer = computer.createAnswer();

        // when
        boolean check = answer.stream().allMatch(num -> 1 <= num && num <= 9);

        // then
        Assertions.assertThat(check).isTrue();
    }

    @DisplayName("정답이 서로 다른 숫자로 구성되어 있는지 테스트")
    @Test
    void checkAnswerOverlap() {
        // given
        List<Integer> answer = computer.createAnswer();

        // when
        Set<Integer> check = new HashSet<>(answer);

        // then
        Assertions.assertThat(check.size()).isEqualTo(3);
    }
}