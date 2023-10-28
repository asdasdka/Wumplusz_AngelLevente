package map;

import game.Game;
import menu.Menu;
import player.Player;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
            super.setCurrentPoint(firstRow[1],firstRow[2] );
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
    @Override
    public String toString() {
        return "Map{" +
                "map=" + Arrays.toString(map) +
                ", mapSize=" + mapSize +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Map map1 = (Map) o;
        return mapSize == map1.mapSize && Arrays.equals(map, map1.map);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), mapSize);
        result = 31 * result + Arrays.hashCode(map);
        return result;
    }
}