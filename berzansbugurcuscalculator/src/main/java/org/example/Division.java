package org.example;

public class Division {
    private int x, y;

    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double div(int x, int y) {           // double = decimaltal
        if (y == 0) {
            throw new IllegalArgumentException("Fel: Kan ej dividera med noll");   // * om användaren försöker dividera med noll, kommer detta svar
        }
        return (double) x / y;
    }

    @Override
    public String toString() {          // Dehär är vad metoden skriver ut
        if (y == 0) {
            return "Fel: Division med noll funkar inte";
        }
        return "Svar: " + div(x, y);
    }
}