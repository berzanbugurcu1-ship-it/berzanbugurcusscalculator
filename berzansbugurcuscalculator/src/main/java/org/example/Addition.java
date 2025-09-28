package org.example;

public class Addition {

    private int x,y;


    public Addition(int x, int y) {     //* förtydlig gör variabeln genom this. osv
        this.x = x;
        this.y = y;
    }

    public int add(int x, int y) {
        return x + y;
    }                                                       // Tar emot två tal och returnerar summan, skapandet av metoden också

    @Override
    public String toString() {
        return "Svar: " + add(x, y);
    }
}
