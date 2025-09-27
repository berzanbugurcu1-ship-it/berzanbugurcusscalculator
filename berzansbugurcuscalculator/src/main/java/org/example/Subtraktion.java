package org.example;

public class Subtraktion {
    private int x, y;

    public Subtraktion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public String toString() {
        return "Svar; " + sub(x, y);
    }
}