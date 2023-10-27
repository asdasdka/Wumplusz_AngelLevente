package map;

import game.Game;
import menu.Menu;
import player.Player;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Map extends Player {
    private char map[][];
    private int mapSize;

    public Map(String playerName, boolean won, String file) {
        super(playerName, won);
        try{
            RandomAccessFile read = new RandomAccessFile(file, "r");
            String firstRow[] = read.readLine().split(" ");
            this.mapSize = Integer.parseInt(firstRow[0]);
            super.setPlayerDirection(firstRow[3].charAt(0));
            super.setStartingPoint(firstRow[1],firstRow[2]);
            super.setCurrentPoint(firstRow[1],firstRow[2]);
            this.map = new char[mapSize][mapSize];
            List<String> tempList = new ArrayList<>();
            for (int i = 0; read.getFilePointer() < read.length(); i++){
                tempList.add(read.readLine());
            }
            for (int i = 0; i < tempList.size(); i++){
                for (int j = 0; j < mapSize; j++){
                    this.map[i][j] = tempList.get(i).charAt(j);
                }
            }
            read.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public char[][] getMap() {
        return map;
    }

    public int getMapSize() {
        return mapSize;
    }

}