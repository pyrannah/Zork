package File.Room;

import File.Room.map.HuntedHouse1;
import File.Room.map.HuntedHouse2;

import java.util.Map;

public enum Mapt {
    HuntedHouse1(HuntedHouse1.class,"huntedhouse1"),
    HuntedHouse2(HuntedHouse2.class, "huntedhouse2");

    private Class<? extends MapOfGame> mapClass;
    private String mapName;
    private String mapDescription;

    Mapt(Class<? extends MapOfGame> mapClass, String mapName) {
        this.mapClass = mapClass;
        this.mapName = mapName;
    }

    public Class<? extends MapOfGame> getMapClass() {
        return mapClass;
    }

    public String getMapName() {
        return mapName;
    }
}
