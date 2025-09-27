package org.example;

public class Multiplikation {
    private int x, y;

    public Multiplikation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multi(int x, int y) {
        return x * y;
    }

    @Override
    public String toString() {
        return "Svar: " + multi(x, y);
    }
}