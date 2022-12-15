package baseball.domain;

public enum GameCommand {
    restart("1"),
    exit("2");

    private String gameCommand;
    GameCommand(String gameCommand) {
        this.gameCommand = gameCommand;
    }

    public static boolean isValidCommand(String input) {
        return input.equals(restart.gameCommand) || input.equals(exit.gameCommand);
    }

}
