public class Addition {

    private int x,y;


    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add(int x, int y) {
        int sum = 0;

        sum += x + y;


        return sum;
    }

    @Override
    public String toString() {
        return "Svar: " + add(x,y);
    }
}
