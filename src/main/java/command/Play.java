package command;

import File.Room.MapFactory;
import File.Room.MapOfGame;
import File.Room.Room;
import ssc.io.hw3.zork.Game;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;

public class Play implements Command {

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "play";
    }

    @Override
    public void excute(Game game, List<String> args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

MapFactory mapFactory = new MapFactory();
//        String mapName = args.get(0).toLowerCase(Locale.ROOT).trim();
        if (args.size() > 0) {// has a second word
            for (String map : MapFactory.getAvailableMap().keySet()){
                String mapName = args.get(0).toLowerCase(Locale.ROOT).trim();
                if(mapFactory.getMap(mapName)!=null){
                    MapOfGame m = MapFactory.createMap(map);
                    game.setMap(m);// set map in game
                    game.setGameIsRunning(true);// set that user is playing
                    game.setGameStartPlay();
                    System.out.println("CONGRATULATION!!");
                    System.out.println("YOU ARE NOW IN THE GAME!!");
                    System.out.println(game.getMap().getDescription());

                    return;// get out
                }
            }// can't find map
                System.out.println("There is no such a map name");
                System.out.println("Or you maybe type it wrong!!");
                System.out.println("please type it again!!");
            System.out.println("huntedhouse1 and huntedhouse2");
        } else {
            System.out.println("play what?? you can't just say play ");
            System.out.println("Please specify the map that you are going to play");
            System.out.println("huntedhouse1 and huntedhouse2");
        }
    }
}



