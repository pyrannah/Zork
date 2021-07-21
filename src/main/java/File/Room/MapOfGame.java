package File.Room;

import java.io.Serializable;


// Serializable can make an object save as a class
public abstract class MapOfGame implements Serializable {

    String name;
    String description;
    Room startRoom;
    String getMap;


    boolean checkTaskComplete;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getStartRoom() {
        return startRoom;
    }

    public void setStartRoom(Room startRoom) {
        this.startRoom = startRoom;
    }

    public boolean getTaskstatus(){
        return checkTaskComplete;
    }
    public abstract void getTheMap();







}
