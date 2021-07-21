package File.Room;

import File.Items.Item;
import File.Items.ItemFactory;
import File.Monsters.Monster;
import File.Monsters.MonsterFactory;

import java.util.ArrayList;
import java.util.List;

public class Room {

    public String name;
    public Room north;
    public Room south;
    public Room east;
    public Room west;

    public String description;// just a little bit of explanation
    public Item item;// This is room have an item or not??
    public Monster monster; // have monster or not
    public List<String> allItem = new ArrayList<>();
    public List<Item> allItem2 = new ArrayList<>();
    public List<Monster> monsterList = new ArrayList<>();
    public List<String> monsterNameList = new ArrayList<>();

// set the room with name and details and where do they place

    public Room(String name, String description, Monster monster, Item item) {
        ItemFactory itemFactory = new ItemFactory();
        MonsterFactory monsterFactory =new MonsterFactory();
        this.name = name;
        this.description = description;
        this.item = item;
        this.monster = monster;
        this.east = null;
        this.north = null;
        this.south = null;
        this.west = null;

        allItem.add("bible");
        allItem.add("holythread");
        allItem.add("holywater");
        allItem.add("key");
        allItem.add("monknecklace");
        allItem.add("occultwood");

        allItem2.add(itemFactory.createItems("bible"));
        allItem2.add(itemFactory.createItems("holythread"));
        allItem2.add(itemFactory.createItems("holywater"));
        allItem2.add(itemFactory.createItems("key"));
        allItem2.add(itemFactory.createItems("monknecklace"));
        allItem2.add(itemFactory.createItems("occultwood"));


        monsterNameList.add("chirstianghost");
        monsterNameList.add("thaighost");
        monsterNameList.add("muslimghost");

        monsterList.add(monsterFactory.createMonster("chirstianghost"));
        monsterList.add(monsterFactory.createMonster("thaighost"));
        monsterList.add(monsterFactory.createMonster("muslimghost"));




    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoomLocation(Room north, Room south, Room east, Room west) {
        this.east = east;
        this.north = north;
        this.south = south;
        this.west = west;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean findItem(String nameOfItem) {// check the all items by name
        if (allItem.contains(nameOfItem)){
            return true;
        }else {
            return false;
        }
    }

    public boolean findMonster(String nameOfMonster){// check all monster name list

        if (monsterNameList.contains(nameOfMonster)){
            return true;
        }else {
            return false;
        }

    }

    public Monster getMonsterFromList(String monster){/// string to MOnster

        for (Monster a : monsterList){
            if (a.getName()==monster){
                return a;
            }
        }
        return null;

    }
    public boolean hasMonster(){
        if (monster==null){
            return false;
        }else {
            return true;
        }

    }


    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Item findItemToGetItem(String item){
        for (Item a : allItem2){
            if (a.getNameOfItem()==item){
                return a;
            }
        }
        return null;
    }


    public void getStatusOftheRoom() {

        System.out.println(description);// add room description also

        if (!(item==null)) {// This has item
            System.out.println("This room has an item called:" + item.getDetailsOfItem());
            System.out.println("This power attack of the item:" + item.getPowerAttack());
            System.out.println("Do you want to pick up this item??");
            System.out.println("It's called :" + item.getNameOfItem());
        }
        if (!(monster==null)) {// This room has monster
            System.out.println("Ohhh there is a monster!! and It's called: " + monster.getName());
            System.out.println(monster.getDetailsOfMonster());
            System.out.println("Attack this" + monster.getName()+"monster!!!");
        }
        if ((item==null) && (monster==null)) {// This room have no item and no monster
            System.out.println("This is just a typical room that has nothing");
        }


    }
}

