package command;

import File.Room.MapFactory;
import File.Room.MapOfGame;
import ssc.io.hw3.zork.Game;

import java.util.List;
import java.util.Locale;

public class Go implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public void excute(Game game, List<String> args) {// go [north],[south],[east],[west]

        if (args.size() >0) {// has a second word
                String direction = args.get(0).toLowerCase(Locale.ROOT).trim();// trim la
             if(direction.equals("north")) {
                 if (game.getRoom().getNorth()==null){
                     System.out.println("There is no room you should find the way back");
                 }else {
                     game.moveRoom(game.getRoom().getNorth());
                     game.getRoom().getDescription();
                     game.getRoom().getStatusOftheRoom();
                 }
             }
                else if(direction.equals("south")){
                    if (game.getRoom().getSouth()==null){
                        System.out.println("There is no room you should find the way back");
                    }else {
                        game.moveRoom(game.getRoom().getSouth());
                        game.getRoom().getDescription();
                        game.getRoom().getStatusOftheRoom();

                    }
                }
                else if(direction.equals("east")) {
                    if (game.getRoom().getEast()==null){
                        System.out.println("There is no room you should find the way back");
                    }else {
                        game.moveRoom(game.getRoom().getEast());
                        game.getRoom().getDescription();
                        game.getRoom().getStatusOftheRoom();
                    }
                }
                else if (direction.equals("west")){
                    if (game.getRoom().getWest()==null){
                        System.out.println("There is no room you should find the way back");
                    }else {
                        game.moveRoom(game.getRoom().getWest());
                        game.getRoom().getDescription();
                        game.getRoom().getStatusOftheRoom();
                    }
                }
        }else {
            System.out.println("go where??");
            System.out.println("Please specify your direction!!");
            System.out.println("go [north]/[east]/[west]/[south]");

        }
    }
}
