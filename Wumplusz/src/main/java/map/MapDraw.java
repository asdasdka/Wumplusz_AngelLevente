package map;

public class MapDraw extends Map{


    public MapDraw(String playerName, boolean won, String file) {
        super(playerName, won, file);
    }

    public void draw(char map[][]){
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < super.getMapSize(); j++){
                if (i == getCurrentPosition()[0] && j == getCurrentPosition()[1]) {
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
