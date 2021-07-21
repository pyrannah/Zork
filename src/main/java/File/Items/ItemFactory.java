package File.Items;

import command.Command;
import command.ExitCommand;
import command.Help;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ItemFactory {

    // Inventory
    private static List<Class<? extends Item>> REGISTERED_ITEM = null;

    public void addItemFactory(Item input) {// when use pick

        REGISTERED_ITEM.add(input.getClass());

    }

    public static List<Class<? extends Item>> getRegisteredItem() {
        return REGISTERED_ITEM;
    }


    public Item createItems(String input) {
        String j = input.toLowerCase(Locale.ROOT).trim();
        if (j.equals("holywater")) {
            return new HolyWater();
        } if (j.equals("key")) {
            return new Key();
        }if (j.equals("monknecklace")) {
            return new MonkNecklace();
        }if (j.equals("occultwood")) {
            return new OccultWood();
        } if (j.equals("holythread")) {
            return new HolyThread();
        } else {
            return new Bible();
        }
    }

}
