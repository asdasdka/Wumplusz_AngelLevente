package player;

import menu.Menu;

public class Player extends Menu {
    private String playerName;
    private boolean won;
    private String startingPoint[] = new String[2];

    private String currentPoint[] =new String[2];
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

    public String[] getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(String value1, String value2) {
        this.currentPoint[0] = value1;
        this.currentPoint[1] = value2;
    }
}