package org.example;

import java.util.Scanner;

public class Main {                             // * denna del gör så att programmet kan läsa in vad användaren skriver i konsolen
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {                         //* En loop som kör tills användaren skriver 5 för att avsluta
            System.out.println("Välkommen till Berzans Kalkylator! Välj ett utav räknesätten nedanför!");
            System.out.println("1) Addition (+)");
            System.out.println("2) Subtraction (-)");
            System.out.println("3) Multiplication (*)");
            System.out.println("4) Division (/)");
            System.out.println("5) Avsluta");

            if (!scanner.hasNextInt()) {                                                          // * Kollar om nästa input från användaren är ett heltal (int), Returnerar true om det är ett heltal, annars false.
                System.out.println("Du behöver skriva in ett nummer, försök igen!");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {                        // Kollar vilket val användaren gjorde och kör rätt kodblock för det räknesättet
                case 1: {
                    System.out.println("Skriv in första numret:");
                    int num1 = scanner.nextInt();
                    System.out.println("Skriv in andra numret:");
                    int num2 = scanner.nextInt();

                    Addition add = new Addition(num1, num2);            // Lägger in klassen, tostring ovandlar inputen av användaren
                    System.out.println(add.toString());
                    break;
                }

                case 2: {
                    System.out.println("Skriv in första numret:");
                    int num1 = scanner.nextInt();
                    System.out.println("Skriv in andra numret:");
                    int num2 = scanner.nextInt();

                    Subtraktion sub = new Subtraktion(num1, num2);
                    System.out.println(sub.toString());
                    break;
                }

                case 3: {
                    System.out.println("Skriv in första numret:");
                    int num1 = scanner.nextInt();
                    System.out.println("Skriv in andra numret:");
                    int num2 = scanner.nextInt();

                    Multiplikation multi = new Multiplikation(num1, num2);
                    System.out.println(multi.toString());
                    break;
            }

                case 4: {
                    System.out.println("Skriv in första numret:");
                    int num1 = scanner.nextInt();
                    System.out.println("Skriv in andra numret:");
                    int num2 = scanner.nextInt();

                    Division div = new Division(num1, num2);
                    System.out.println(div.toString());
                    break;
                }

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Felaktigt val, testa igen!");         // om användaren skriver en annan siffra än 1-5, returneras detta

            }
        }

        scanner.close();

    }
}