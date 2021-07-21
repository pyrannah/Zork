package command;

import File.Monsters.Monster;
import File.Player.Player;
import File.Room.Room;
import ssc.io.hw3.zork.Game;

import java.util.List;

public class Info implements Command {// print out information of the player and the room that the player is currently in, this command only available while playing game
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public void excute(Game game, List<String> args) {

        Player player = game.getPlayer();
        Room room = game.getRoom();


        System.out.println("Player status:");
        System.out.println("HP:"+ player.getHp());
        System.out.println("HP MAX"+ player.getHP_MAX());
        System.out.println("Current attack power:"+ player.getAttackPower());
        System.out.println("Inventory :");
        player.getItemInCurrentInInventory();

        System.out.println("You are at:"+ room.getName());
        System.out.println("Explanation :"+ room.getDescription());// include monster and item already

    }



}
