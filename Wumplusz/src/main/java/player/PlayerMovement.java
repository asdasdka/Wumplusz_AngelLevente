package player;

import map.MapDraw;

public class PlayerMovement extends MapDraw {
    public PlayerMovement(String playerName, boolean won, String file) {
        super(playerName, won, file);

    }

    public void move(String input){
        switch (input){
            case "N":{
                setCurrentPoint(String.valueOf(getCurrentPosition()[0] + 1),String.valueOf(getCurrentPosition()[1]));
                System.out.println(input);
                break;
            }
            case "S":{
                setCurrentPoint(String.valueOf(getCurrentPosition()[0] - 1),String.valueOf(getCurrentPosition()[1]));
                System.out.println(input);
                break;
            }
            case "E":{
                setCurrentPoint(String.valueOf(getCurrentPosition()[0]),String.valueOf(getCurrentPosition()[1] + 1));
                System.out.println(input);
                break;
            }
            case "W":{
                setCurrentPoint(String.valueOf(getCurrentPosition()[0]),String.valueOf(getCurrentPosition()[1] - 1));
                System.out.println(input);
                break;
            }
            default:{
                System.out.println("Nem megfelelő az irány, az angol irányok rövidítését próbáld meg(N,W,E,S).");
            }
        }
    }


}
