package command;
import org.junit.jupiter.api.Test;

import ssc.io.hw3.zork.CommandParser;

public class CommandParserTest {

    @Test
    void testParser(){
        CommandParser commandParser = new CommandParser();
        commandParser.parse("exit helloword");
    }
}
