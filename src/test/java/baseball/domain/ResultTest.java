package baseball.domain;


import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ResultTest {

    private Result result = new Result();

    @DisplayName("컴퓨터가 제시한 정답과 사용자의 입력값을 비교해서 힌트를 제공하는 기능 테스트")
    @ParameterizedTest
    @MethodSource("generateData")
    void testgiveHint(List<Integer> answer, String userInput, int[] result) {
        // given
        int[] hintResult = this.result.giveHint(answer, userInput);

        assertThat(hintResult).isEqualTo(result);
    }


    static Stream<Arguments> generateData() {
        return Stream.of(
            Arguments.of(Arrays.asList(1,2,3), "321", new int[] {1,2}),
            Arguments.of(Arrays.asList(3,1,2), "123", new int[] {0,3})
        );
    }
}