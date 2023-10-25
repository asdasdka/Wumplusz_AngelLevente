package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Map {
    private char map[][];
    private String startingPoint[];
    private char playerDirection;

    //wumpuszinput beolvasása
     public Map (String file) {
        try{
            RandomAccessFile read = new RandomAccessFile(file, "r");
            String firstRow[] = read.readLine().split(" ");
            int mapSize = Integer.parseInt(firstRow[0]);
            this.startingPoint = new String[2];
            this.startingPoint[0] = firstRow[1];
            this.startingPoint[1] = firstRow[2];
            this.playerDirection = firstRow[3].charAt(0);
            this.map = new char[mapSize][mapSize];
            List<Character> tempList = new ArrayList<>();
            for (int i = 0; read.getFilePointer() < read.length(); i++){
                tempList.add(read.readChar());
            }
            
            System.out.println(tempList.get(3));


            read.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public char[][] getMap() {
        return map;
    }

    public String getStartingPoint() {
        return startingPoint[0].concat(startingPoint[1]);
    }

    public char getPlayerDirection() {
        return playerDirection;
    }

    public void setPlayerDirection(char playerDirection) {
        this.playerDirection = playerDirection;
    }
}
