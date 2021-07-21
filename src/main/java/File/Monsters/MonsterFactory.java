package File.Monsters;

import java.util.Locale;

public class MonsterFactory {

    public Monster createMonster(String name){
        String monster = name.toLowerCase(Locale.ROOT).trim();
        if (monster.equals("christianghost")) {
            return new ChirstianGhost();
        }
        if (monster.equals("muslimghost")) {
            return new MuslimGhost();
        }
        else if (monster.equals("thaighost")) {
            return new ThaiGhost();
        }
        return null;
    }




}
