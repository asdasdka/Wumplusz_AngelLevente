package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Játékos nevének bekérése
        System.out.println("Üdv a WUMPUS játékban. Kérlek add meg a neved!");
        String playerName = request();

        //A játékos pályaszerkesztésbe, mentésbe, betöltésbe, játszásba, kilépésbe lép
        while (true) {
            System.out.println("\nVálasszon a következő lehetőségek közül:");
            System.out.println("1. Beolvasás");
            System.out.println("2. Mentés");
            System.out.println("3. Betöltés");
            System.out.println("4. Játék");
            System.out.println("5. Kilépés");

            int answear = Integer.parseInt(request());

            switch (answear) {
                case 1://átírányítás a pályaszerkesztőbe
                    Map map = new Map("src/main/resources/wumpuszinput.txt");
                    break;
                case 2:
                    System.out.println("Mentés opció kiválasztva");
                    break;
                case 3:
                    System.out.println("Betöltés opció kiválasztva");
                    break;
                case 4:
                    System.out.println("Játék opció kiválasztva");
                    break;
                case 5:
                    System.out.println("Kilépés opció kiválasztva. Viszlát " + playerName + "!");
                    System.exit(0);
                default:
                    System.out.println("Hibás választás. Kérem, válasszon újra.");
            }
        }
    }




    //A konzolról való beolvasást megkönnyító bekérő metódus
    public static String request() {
        Scanner consoleInput = new Scanner(System.in);
        return consoleInput.nextLine();
    }

}
