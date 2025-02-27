package baseball.util;

public class Constant {

    public static final int LENGTH = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public static final String USER_ANSWER_REGEX = "^[1-9]+$";
    public static final int ANSWER = 3;

    public static final String USER_ANSWER_LENGTH_ERROR = "[ERROR] 정답 입력값은 길이가 3이어야 합니다.";
    public static final String USER_ANSWER_CONSIST_OF_1_TO_9_ERROR = "[ERROR] 1과 9사이의 수만 입력되어야 합니다.";
    public static final String USER_ANSWER_OVERLAP_ERROR = "[ERROR] 서로다른 숫자로 구성되어야 합니다.";
    public static final String USER_COMMAND_ERROR = "[ERROR] 1과 2만 입력하셔야 합니다.";

    public static final String USER_ANSWER_QUESTION = "숫자를 입력해주세요 : ";
    public static final String USER_GAME_RESTART_EXIT_QUESTION = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";
    public static final String NOTHING = "낫싱";
    public static final String ANSWER_MENT = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
}
