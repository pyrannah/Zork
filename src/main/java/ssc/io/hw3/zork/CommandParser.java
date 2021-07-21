package ssc.io.hw3.zork;

import command.Command;

import java.util.*;

public class CommandParser {

    private List<String> allCommandsSortedByLenght = new ArrayList<>();

    {

        allCommandsSortedByLenght.addAll(CommandFactory.getAllCommands());
        allCommandsSortedByLenght.sort((o1, o2) -> o2.length() - o1.length());


    }


    private String matchInputToCommand(String input) {
        for (String command : allCommandsSortedByLenght) {
            if (input.startsWith(command)) {
                return command;
            }
        }
        return null;
    }


    public List<String> parse(String stringInput) {
        String cleanInput = stringInput.trim().toLowerCase(Locale.ROOT);
        String cmd = matchInputToCommand(cleanInput);
        Command command = CommandFactory.getCommand(cmd);
        String[] check = cleanInput.split(" ");

        int size = check.length;
        if (command == null) {
            System.out.println("There is no such a command");
            return Arrays.asList(cmd);

        } else if ((command.numArgs() > 0) && (size > 1)) {// > 0 has 2 words


            String argString = cleanInput.substring(cmd.length()+1).trim();
            return Arrays.asList(cmd, argString);
        }
        return Arrays.asList(cmd);
    }
}




