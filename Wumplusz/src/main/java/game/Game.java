package game;

import map.Map;
import map.MapDraw;
import menu.Menu;
import player.PlayerMovement;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Game game = (Game) o;
        return gameIsOn == game.gameIsOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gameIsOn);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameIsOn=" + gameIsOn +
                '}';
    }
}
