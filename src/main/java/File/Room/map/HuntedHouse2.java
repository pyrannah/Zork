package File.Room.map;

import File.Items.ItemFactory;
import File.Monsters.MonsterFactory;
import File.Room.MapOfGame;
import File.Room.Room;

import java.util.ArrayList;
import java.util.List;

public class HuntedHouse2 extends MapOfGame {


    public List<Room> listAllRooms = new ArrayList<>();
    List<String> nameAll = new ArrayList<>();
    List<Room> nameAllRoom = new ArrayList<>();


    public HuntedHouse2() {
        setName("HuntedHouse1");
        setDescription("The haunted house kept its ghosts for the same reason people keep a strong dog, to guard and to love, to ease the lonely hours.");

        // put the name of each room
        nameAll.add("Living room");
        nameAll.add("Garage");
        nameAll.add("Bathroom");
        nameAll.add("Hallway");
        nameAll.add("Storage room");
        nameAll.add("Secret room");

        MonsterFactory monsterFactory = new MonsterFactory();
        ItemFactory itemFactory = new ItemFactory();
        int numberOfRoom = 1;

        // set the room up and drop the monster and item
        Room room1 = new Room("Living room","This is a lovely room style!!",null, itemFactory.createItems("holywater"));
        Room room2 = new Room("Garage","This is the garage room has no car at all", monsterFactory.createMonster("christianghost"),null);
        Room room3 = new Room("Bathroom","This smells so weird!! what happened to this place??",monsterFactory.createMonster("thaighost"),itemFactory.createItems("key"));
        Room room4 = new Room("Hallway","This room is so big!! and has so many decorations",monsterFactory.createMonster("muslimghost"),itemFactory.createItems("holythread"));
        Room room5 = new Room("Secret room",".... well so dark!! I can't see anything",null,null);
        Room room6 = new Room("Starto","This is the started room to begin try your best to complete the task!!",null,null);

        room1.setRoomLocation(null,room6,room3,null);
        room2.setRoomLocation(null,null,room6,null);
        room3.setRoomLocation(null,null,null,room1);
        room4.setRoomLocation(room6,room5,null,null);
        room5.setRoomLocation(room4,null,null,null);

        nameAllRoom.add(room1);
        nameAllRoom.add(room2);
        nameAllRoom.add(room3);
        nameAllRoom.add(room4);
        nameAllRoom.add(room5);


    }

    public void getTheMap(){

        System.out.println("" +
                "--                                                     +------------+\n" +
                "--                                                     |            |\n" +
                "--                                                     |            |\n" +
                "--                                                     |            |\n" +
                "--                                                     | black hoe  |\n" +
                "--                                                     |            |\n" +
                "--                                                     |            |\n" +
                "--                          +-------------+------------+------------+\n" +
                "--                          |             |            |\n" +
                "--                          |             |            |\n" +
                "--                          |             |            |\n" +
                "--                          |     red     |    black   |\n" +
                "--                          |             |            |\n" +
                "--                          |             |            |\n" +
                "--                          |             |            |\n" +
                "--               +----------++------------+------------+\n" +
                "--               |           |            |\n" +
                "--               |           |            |\n" +
                "--               |           |            |\n" +
                "--               |  yellow   |   START    |\n" +
                "--               |           |            |\n" +
                "--               |           |            |\n" +
                "--               +-----------+------------+-------------+\n" +
                "-- +-------------+                        |             |\n" +
                "-- |             |                        |             |\n" +
                "-- |             |                        |             |\n" +
                "-- |             |                        |    white    |\n" +
                "-- |             |                        |             |\n" +
                "-- |   green     |                        |             |\n" +
                "-- |             |                        |             |\n" +
                "-- |             |                        +-------------+\n" +
                "-- +-------------+");

    }
}
