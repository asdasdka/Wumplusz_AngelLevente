package map;

import player.Player;

public class MapDraw extends Map{


    public MapDraw(String playerName, boolean won, String file) {
        super(playerName, won, file);
    }

    public void draw(char map[][]){
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < super.getMapSize(); j++){
                if (i == getCurrentPoint()[0] && j == getCurrentPoint()[1]) {
                    System.out.print("H");
                }else{
                    System.out.print(map[i][j]);
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
