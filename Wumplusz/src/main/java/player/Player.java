package player;

import map.Map;
import menu.Menu;

import java.util.Arrays;
import java.util.Objects;

public class Player extends Menu {
    private String playerName;
    private Map map;
    private boolean won;
    private String startingPoint[] = new String[2];
    private String currentPosition[] =new String[2];
    private char playerDirection;

    public Player(String playerName, boolean won) {
        this.playerName = playerName;
        this.won = won;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean isWon() {
        return won;
    }

    public String[] getStartingPoint() {
        return startingPoint;
    }

    public char getPlayerDirection() {
        return playerDirection;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public void setStartingPoint(String value1, String value2) {
        this.startingPoint[0] = value1;
        this.startingPoint[1] = value2;
    }

    public void setPlayerDirection(char playerDirection) {
        this.playerDirection = playerDirection;
    }

    public int[] getCurrentPosition() {
        int result[] = new int[2];
        int number = 0;
        for (char i = 'A'; i < 'T'; i++){
            if (i == this.currentPosition[0].charAt(0)){
                result[0] = number;
            }else{

                number += 1;
            }
        }
        result[1] = Integer.parseInt(getStartingPoint()[1]) - 1;
        return result;
    }

    public void setCurrentPoint(String value1, String value2) {
        this.currentPosition[0] = value1;
        this.currentPosition[1] = value2;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", map=" + map +
                ", won=" + won +
                ", startingPoint=" + Arrays.toString(startingPoint) +
                ", currentPosition=" + Arrays.toString(currentPosition) +
                ", playerDirection=" + playerDirection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return won == player.won && playerDirection == player.playerDirection && Objects.equals(playerName, player.playerName) && Objects.equals(map, player.map) && Arrays.equals(startingPoint, player.startingPoint) && Arrays.equals(currentPosition, player.currentPosition);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(playerName, map, won, playerDirection);
        result = 31 * result + Arrays.hashCode(startingPoint);
        result = 31 * result + Arrays.hashCode(currentPosition);
        return result;
    }
}