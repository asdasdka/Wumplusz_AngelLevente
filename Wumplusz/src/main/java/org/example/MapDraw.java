package org.example;

public class MapDraw extends Map{

    public MapDraw(String file) {
        super(file);
    }

    public void draw(char map[][]){
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < super.getMapSize(); j++){
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
