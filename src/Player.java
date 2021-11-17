import java.util.Random;

public class Player {
    private int sumOfThrown = 0;
    public Player(){}

    public int throwTheDice() {
        Random rand = new Random();
        int temp = rand.nextInt((6 - 1) + 1) + 1;
        this.sumOfThrown += temp;
        return temp;
    }
    public int getSumOfThrown() {
        return sumOfThrown;
    }
}
