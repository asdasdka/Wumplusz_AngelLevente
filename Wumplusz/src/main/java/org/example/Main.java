package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Játékos nevének bekérése
        System.out.println("Üdv a WUMPUS játékban. Kérlek add meg a neved!");
        Scanner consoleInput = new Scanner(System.in);
        String playerName = consoleInput.nextLine();

        //A játékos pályaszerkesztésbe, mentésbe, betöltésbe, játszásba, kilépésbe lép
        while (true) {
            System.out.println("\nVálasszon a következő lehetőségek közül:");
            System.out.println("1. Pályaszerkesztés");
            System.out.println("2. Mentés");
            System.out.println("3. Betöltés");
            System.out.println("4. Játék");
            System.out.println("5. Kilépés");

            int answear = consoleInput.nextInt();

            switch (answear) {
                case 1:
                    //Pálya méretének bekérése
                    System.out.println("Mekkora legyen a pálya mérete?(NxN | 6-20)");

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
}
