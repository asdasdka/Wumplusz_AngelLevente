package game;

import map.Map;
import map.MapDraw;
import menu.Menu;
import player.PlayerMovement;

public class Game extends PlayerMovement {
    private boolean gameIsOn;

    public Game(String playerName, boolean won, String file, boolean gameIsOn) {
        super(playerName, won, file);
        this.gameIsOn = gameIsOn;
        gaming();
    }

    public void gaming(){
        while(gameIsOn){
            draw(getMap());
            System.out.println("Merre kíván tovább menni?");
            System.out.println(getCurrentPosition()[0] + 1);
            move(request());
        }
    }



}
