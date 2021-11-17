import java.util.ArrayList;
import java.util.Random;

public class DiceGame extends Game {
    private ArrayList<Player> playersList;
    private boolean b = false;

    @Override
    void initializeGame() {
        System.out.println("Each player throws the dice 10 times. The player with the largest total" +
                " sum wins.\n");
        playersList = new ArrayList<>(super.playersCount);
    }

    @Override
    void makePlay(int player) {
        Player p = new Player();
        int i=0;
        do {
            int temp = p.throwTheDice();
            System.out.println("player number ("+(player)+") throws the dice," +
                    " he gets a "+temp+"....");

            i++;
        }while (i<10);
        System.out.println("his total is:"+p.getSumOfThrown()+"\n");
        playersList.add(p);
        if (playersList.size()>=super.playersCount){
            b = true;
        }
    }

    @Override
    boolean endOfGame() {
        return b;
    }

    @Override
    void printWinner() {
        int largestSum = playersList.get(0).getSumOfThrown();
        int winner = 0;
        for(int i=0;i<playersList.size();i++){
         int check = playersList.get(i).getSumOfThrown();
         if(check>largestSum){
             largestSum = check;
             winner = i;
            }

        }
        System.out.println("winner is player number: "+winner
                +" with the total sum of "+playersList.get(winner).getSumOfThrown()
                +" thrown from the dices...");
    }

    /*specific declarations*/

    public DiceGame(){}
}
