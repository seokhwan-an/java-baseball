package baseball.view;

import static baseball.util.Constant.*;

public class OutputView {

    public static void printStart() {
        System.out.println(GAME_START);
    }

    public static void printHint(int[] hint) {
        if (hint[0] == 0 && hint[1] == 0) {
            System.out.println(NOTHING);
        } else if (hint[0] == 0) {
            System.out.println(hint[1] + BALL);
        } else if (hint[1] == 0) {
            System.out.println(hint[0] + STRIKE);
        } else if (hint[0] != 0 && hint[1] != 0) {
            System.out.println(hint[1] + BALL + " " + hint[0] + STRIKE);
        }
    }

}
