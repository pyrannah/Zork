package command;

import File.Items.Item;
import File.Room.Room;
import ssc.io.hw3.zork.Game;

import java.util.List;
import java.util.Locale;

public class Save implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "save";
    }

    @Override
    public void excute(Game game, List<String> args) {
        System.out.println(args.get(0));
    }
}
