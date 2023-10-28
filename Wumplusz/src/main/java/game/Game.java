package game;

import map.Map;
import map.MapDraw;
import menu.Menu;

public class Game extends MapDraw {
    private boolean gameIsOn;

    public Game(String playerName, boolean won, String file, boolean gameIsOn) {
        super(playerName, won, file);
        this.gameIsOn = gameIsOn;
    }

}
