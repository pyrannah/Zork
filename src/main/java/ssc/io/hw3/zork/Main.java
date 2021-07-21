package ssc.io.hw3.zork;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Game start = new Game();
        start.play("Help");

    }
}
