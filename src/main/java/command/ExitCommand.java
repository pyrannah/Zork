package command;

import ssc.io.hw3.zork.Game;

import java.util.List;

public class ExitCommand implements Command{

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "exit";
    }

    @Override
    public void excute(Game game, List<String> args) {
        game.getOutput().println("Game exit");
        game.exit();  // exit immediately

    }
}
