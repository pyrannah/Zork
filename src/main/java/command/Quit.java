package command;

import ssc.io.hw3.zork.Game;

import java.util.List;

public class Quit implements Command{

    @Override

    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "quit";
    }

    @Override
    public void excute(Game game, List<String> args) {

        if (game.isGameIsRunning()==false){
            System.out.println("You can't use quit because you are not in the game ");
        }
        game.setGameIsRunning(false);


    }
}
