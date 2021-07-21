package command;

import ssc.io.hw3.zork.Game;

import java.util.List;

public class Load implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "load";
    }

    @Override// get [1] already
    public void excute(Game game, List<String> args) {

        System.out.println(args.get(0));

    }
}
