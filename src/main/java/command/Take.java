package command;
import File.Items.Item;
import File.Room.Room;
import ssc.io.hw3.zork.Game;
import java.util.List;
import java.util.Locale;

public class Take implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "take";
    }

    @Override
    public void excute(Game game, List<String> args) {
        Room room = game.getRoom();
        String item = args.get(0).toLowerCase(Locale.ROOT).trim();


        if (args.size() >0) {// has second word

            if (room.findItem(item)) {// has this item
                // check room that has an item or not
                if (room.getItem()==null) { // this room have no such an item
                    System.out.println("This room has no such an item!!");
                    System.out.println("Or you maybe type it wrong!!");
                    System.out.println("please type it again!!");

                } else {// they has it in that room
                    Item item3 = game.room.findItemToGetItem(item);
                    game.player.setInventory(item3);
                    System.out.println("You put : " + item + "in your inventory!!");

                }
            }
/// has no such an item
            else {
                System.out.println("There is no such a name of this one");
                System.out.println("Or you maybe type it wrong!!");
                System.out.println("please type it again!!");
            }
        } else { // has no word after "take'
            System.out.println("What are you doing?? you can't just take nothing ");
            System.out.println("Please specify the item that you are going to take..");
        }
    }
}
