package map;

import player.Player;

public class MapDraw extends Map{


    public MapDraw(String playerName, boolean won, String file) {
        super(playerName, won, file);
    }

    public void draw(char map[][]){
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < super.getMapSize(); j++){
                if (String.valueOf(map[i][j]).equals(getCurrentPoint())) {
                    System.out.print(map[i][j]);
                }else{
                    System.out.print("H");
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
