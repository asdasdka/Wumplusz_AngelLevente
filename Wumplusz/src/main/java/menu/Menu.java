package menu;

import game.Game;
import map.Map;
import map.MapDraw;
import player.Player;

import java.util.Scanner;

public class Menu {

    public void mainMenu(){
        System.out.println("Üdv a wumpus látékban, kérlek add meg a neved!");
        Player player = new Player(request(), false);
        menuAction(player);

    }

    public void gamee(Player player){
        Map map = new Map(player.getPlayerName(), player.isWon(), "Wumplusz/src/main/resources/wumpuszinput.txt");
        System.out.println("Pálya beolvasása kész!");
        System.out.println("Jó játékot " + player.getPlayerName() + "!");
        Game game = new Game(player.getPlayerName(), player.isWon(), "Wumplusz/src/main/resources/wumpuszinput.txt",true);
        MapDraw mapDraw = new MapDraw(player.getPlayerName(), player.isWon(), "Wumplusz/src/main/resources/wumpuszinput.txt");
        mapDraw.draw(mapDraw.getMap());
    }
    public String request(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void menuAction(Player player){
        System.out.println("--Főmenü--");
        System.out.println("1. Játék");
        System.out.println("2. Kilépés");

        int input = Integer.parseInt(request());
        switch (input){
            case 1:{
                gamee(player);
                break;
            }
            case 2:{
                System.out.println("Viszlát " + player.getPlayerName() + "!");
                System.exit(0);
                break;
            }
            default:
                System.out.println("Csak a megadott menüpontokból választhatsz. 1-2");

        }
    }
}
