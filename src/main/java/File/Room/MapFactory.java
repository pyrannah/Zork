package File.Room;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// create class
public class MapFactory {
    private static Map<String,MapOfGame> MAP_LIST = new HashMap<>();{{
    Mapt[] map = Mapt.values();
        for(int i = 0; i < map.length; i++) {
        try {
            MapOfGame map1 =  map[i].getMapClass().getDeclaredConstructor().newInstance();
            MAP_LIST.put(map[i].getMapName(), (MapOfGame) map1);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}};

    public static MapOfGame createMap(String name) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String mapName = name.toLowerCase(Locale.ROOT).trim();
        for (String map : MAP_LIST.keySet()) {
            if (map.toLowerCase(Locale.ROOT).equals(mapName)) {
                return MAP_LIST.get(mapName).getClass().getDeclaredConstructor().newInstance();
            }
        }
        return null;
    }

    public static Map<String, MapOfGame> getAvailableMap() {
        return MAP_LIST;
    }

    public MapOfGame getMap(String map){ // find map name
        String map1 = map.toLowerCase(Locale.ROOT).trim();

        for (String name: MAP_LIST.keySet()){
            if (name.toLowerCase(Locale.ROOT).trim().equals(map1)){
                return MAP_LIST.get(name);
            }
        }
            return null;
    }

}
