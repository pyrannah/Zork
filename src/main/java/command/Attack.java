package command;

import File.Items.Item;
import File.Monsters.Monster;
import File.Room.Room;
import ssc.io.hw3.zork.Game;

import java.util.List;
import java.util.Locale;

public class Attack implements Command{

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public void excute(Game game, List<String> args) {
        Room room = game.getRoom();
        String item = args.get(0).toLowerCase(Locale.ROOT).trim();

        if (args.size() > 0 && game.gameIsRunning) {// has second word

            if (room.hasMonster()) {// this room have a monster

                Item itemToHit = game.player.getItem(item);
                game.player.setItem(itemToHit);// set that player is going to use
                // check room that has an item or not
                if (game.player.getItem() != null) {// check that player has an item
                    System.out.println("PLease type attack with {item}");

                    if (room.hasMonster()) {// this room has monster

                        Monster monster = game.room.getMonster();


                        game.player.attack(monster);


                        System.out.println("You just attack :" + monster.getName());

                        if (monster.getAlive() == true) { // if monster still alive
                            System.out.println("This monster has :" + monster.getHP() + "HP");
                            System.out.println("Your hp :" + game.player.getHp());
                            System.out.println("Attack again!!");
                        } else {
                            System.out.println("CONGRATULATION!! YOU JUST KILLED THE GHOST!!");
                        }

                    } else {// this room does not have a monster!!
                        System.out.println("This room has no such a monster");
                        System.out.println("Please specify a correct name!!");
                    }
                }else {
                    System.out.println("you can't attack them");
                    System.out.println("you have to find the item!!");
                }
            }

            else {
                System.out.println("There is no such a name of this monster");
                System.out.println("Or you maybe type it wrong!!");
                System.out.println("please type it again!!");
            }
        } else { // has no word after "take'
            System.out.println("Attack with what?? you can't just attack ");
            System.out.println("Please specify the name that you are going to hit..");
        }







    }
}
