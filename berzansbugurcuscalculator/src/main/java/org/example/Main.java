package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Berzans Calculator");
            System.out.println("1) Addition (+)");
            System.out.println("2) Subtraction (-)");
            System.out.println("3) Multiplication (*)");
            System.out.println("4) Division (/)");
            System.out.println("5) Avsluta");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Skriv in första numret:");          //fixa modulus imorgon för vg, lägg till hur du tänkt och förklaringar/reflektioner bakom koden
                    int num1 = scanner.nextInt();
                    System.out.println("Skriv in andra numret:");
                    int num2 = scanner.nextInt();

                    Addition add = new Addition(num1, num2);
                    System.out.println(add.toString());
                    break;
                }


                case 2: {

                }

                case 3: {

                }

                case 4: {
                }

                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Felaktigt val, testa igen!");

            }
        }

        scanner.close();

    }
}