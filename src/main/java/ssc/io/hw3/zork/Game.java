package ssc.io.hw3.zork;

import File.Player.Player;
import File.Room.MapOfGame;
import File.Room.Room;
import command.Command;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Game {

    private GameOutput output = new GameOutput();
    private  CommandParser commandParser = new CommandParser();
    public ArrayList listOfRoom = new ArrayList();

    public boolean gameIsRunning = false;// in the game

    private MapOfGame mapOfGame = null;
    public Room room;
    public Player player = new Player();



    public void play(String i) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        while (gameIsRunning == false) { //not it the game
            welcome();
            while (true) {
                Scanner in = new Scanner(System.in);
                String s = in.nextLine().toLowerCase(Locale.ROOT); // to lowercase
                List<String> words = commandParser.parse(s);

                Command command = CommandFactory.getCommand(words.get(0));

                if (command != null) {
                    command.excute(this, words.subList(1, words.size()));
                    output.println(s);

                }
            }
        }
    }

        public void setGameStartPlay(){
            Room roomGet = mapOfGame.getStartRoom();
            room = roomGet;
        }

        public void welcome(){
            System.out.println("Welcome everyone!!");
            System.out.println("███████╗ ██████╗ ██████╗ ██╗  ██╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗██╗\n" +
                    "╚══███╔╝██╔═══██╗██╔══██╗██║ ██╔╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║██║\n" +
                    "  ███╔╝ ██║   ██║██████╔╝█████╔╝     ██║  ███╗███████║██╔████╔██║█████╗  ██║██║\n" +
                    " ███╔╝  ██║   ██║██╔══██╗██╔═██╗     ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝╚═╝\n" +
                    "███████╗╚██████╔╝██║  ██║██║  ██╗    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗██╗\n" +
                    "╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝  hunted   ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝╚═╝");
            System.out.println("Your duty is to find the way to get out from this house , go get the key and room to get out!!");
            System.out.println("This house has a ghost that can attack you, be careful!! GOOD LUCK!!");

            System.out.println("YOU ALSO CAN CHOOSE THE MAP TO PLAY!!");
            System.out.println("PICK ONE!!");
            System.out.println("____________________________________________________________________________");
            System.out.println("huntedhouse1 or huntedhouse2");
            System.out.println("OHH DO NOT FORGET TO TYPE play command before CHOOSING THE MAP : FOR EXAMPLE, play huntedhouse1 ");
        }

        public void setGameIsRunning(Boolean bool){
        this.gameIsRunning = bool;
        }


    public void setRoom(Room room) {
        this.room = room;
    }

    public GameOutput getOutput() {

        return output;
    }

    public void exit() {

        System.exit(0);

    }

    public MapOfGame getMapOfGame() {
        return mapOfGame;
    }

    public Room getRoom() {
        return room;
    }

    public void setOutput(GameOutput output) {
        this.output = output;
    }

    public CommandParser getCommandParser() {
        return commandParser;
    }

    public void setCommandParser(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public ArrayList getListOfRoom() {
        return listOfRoom;
    }

    public void setListOfRoom(ArrayList listOfRoom) {
        this.listOfRoom = listOfRoom;
    }

    public boolean isGameIsRunning() {
        return gameIsRunning;
    }

    public void setGameIsRunning(boolean gameIsRunning) {
        this.gameIsRunning = gameIsRunning;
    }

    public MapOfGame getMap() {
        return mapOfGame;
    }

    public void setMap(MapOfGame map) {
        this.mapOfGame = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void moveRoom(Room room){
        this.room = room;
    }

}
