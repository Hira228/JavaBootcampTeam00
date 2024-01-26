package game;

import Colors.Colors;
import com.beust.jcommander.JCommander;
import com.diogonunes.jcdp.color.api.Ansi;
import com.school.team.Utils.Pair;
import logic.GameMap;
import logic.ParseCommandLine;

import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException {
        ParseCommandLine parseCommandLine = new ParseCommandLine();
        JCommander jCommander = JCommander.newBuilder().addObject(parseCommandLine).build();
        jCommander.parse(args);

        GameMap gameMap = new GameMap(parseCommandLine);
        gameMap.generateMap();
       gameMap.PrintGameMap();

        int[][] mama = gameMap.generateIntMap();

    }

}