package org.example;

public class Division {
    private int x, y;

    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double div(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Fel: Kan ej dividera med noll");
        }
        return (double) x / y;
    }

    @Override
    public String toString() {
        if (y == 0) {
            return "Fel: Division med noll funkar inte";
        }
        return "Svar: " + div(x, y);
    }
}