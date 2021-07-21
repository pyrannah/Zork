package command;

import ssc.io.hw3.zork.Game;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Command {

    int numArgs();

    String getCommand();

    void excute(Game game,List<String> args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;

}
