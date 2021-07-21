package command;

import ssc.io.hw3.zork.Game;

import java.util.List;

public class Help implements Command{

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public void excute(Game game, List<String> args) {
        System.out.println("    ___    ____   __  __                                                           __    \n" +
                "   /   |  / / /  / /_/ /_  ___     _________  ____ ___  ____ ___  ____ _____  ____/ /____\n" +
                "  / /| | / / /  / __/ __ \\/ _ \\   / ___/ __ \\/ __ `__ \\/ __ `__ \\/ __ `/ __ \\/ __  / ___/\n" +
                " / ___ |/ / /  / /_/ / / /  __/  / /__/ /_/ / / / / / / / / / / / /_/ / / / / /_/ (__  ) \n" +
                "/_/  |_/_/_/   \\__/_/ /_/\\___/   \\___/\\____/_/ /_/ /_/_/ /_/ /_/\\__,_/_/ /_/\\__,_/____/  \n" +
                "                                                                                        ");
        System.out.println("info : print out the information of the player and the room information ");
        System.out.println("take : pick up the item");
        System.out.println("drop : drop the item choice");
        System.out.println("attack with : attack the monster");
        System.out.println("go{direction} : move player to the room (North,South,West,East)");
        System.out.println("map : print 2D maps");
        System.out.println("autopilot{file} : run this game");
        System.out.println("help : print all commands");
        System.out.println("quit : end the current game and return to command prompt");
        System.out.println("play{map-name} : play new game");
        System.out.println("load{saved-point-name} :  load game state from saved point, this command only available at when start the game.");
        System.out.println("save{saved-point-name} :  load game state from saved point, this command only available while playing game.");
        System.out.println("exit : exit whole game, this command only available at when start the game.");

    }
}
