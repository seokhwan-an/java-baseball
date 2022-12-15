package baseball.view;

import static baseball.util.Constant.*;

public class OutputView {

    public static void printStart() {
        System.out.println(GAME_START);
    }

    public static void printHint(int[] hint) {
        if(hint[0] == 0 && hint[1] == 0) {
            System.out.println("낫싱");
        } else if(hint[0] == 0) {
            System.out.println(hint[1]+"볼");
        } else if(hint[1] == 0) {
            System.out.println(hint[0]+"스트라이크");
        } else if(hint[0] != 0 && hint[1] != 0) {
            System.out.println(hint[1]+"볼" + hint[0]+"스트라이크");
        }
    }

}
