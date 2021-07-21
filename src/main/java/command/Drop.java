package command;

import ssc.io.hw3.zork.Game;

import java.util.List;

public class Drop implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public void excute(Game game, List<String> args) {

    }
}
