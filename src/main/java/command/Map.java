package command;

import File.Room.MapOfGame;
import ssc.io.hw3.zork.Game;

import java.util.List;


//ASCII
public class Map implements Command{


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "map";
    }

    @Override
    public void excute(Game game, List<String> args) {

        MapOfGame currentMap = game.getMap();
        if (currentMap == null) {
            System.out.println("Choose the map first!!");
        } else {
            currentMap.getTheMap();// print map ascii

        }
    }


}
