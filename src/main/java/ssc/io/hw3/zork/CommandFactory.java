package ssc.io.hw3.zork;

import command.*;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class CommandFactory {


    private static final List<Class<? extends Command>> REGISTERED_COMMAND = Arrays.asList(
            ExitCommand.class,
            Help.class,
            Drop.class,
            Info.class,
            command.Map.class,
            Load.class,
            Play.class,
            Quit.class,
            Save.class,
            Take.class,
            Go.class,
            Attack.class

    );
    private static final Map<String, Command> COMMANDS_MAP = new HashMap();


    static {
        {
            for (Class<? extends Command> commandClass : REGISTERED_COMMAND) {
                try {
                    Command command = commandClass.getDeclaredConstructor().newInstance();
                    COMMANDS_MAP.put(command.getCommand(), command);

                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static Command getCommand(String command) {
        return COMMANDS_MAP.get(command);


    }

    public static List<String> getAllCommands() {
        return COMMANDS_MAP.keySet().stream().collect(Collectors.toList());


    }
}
