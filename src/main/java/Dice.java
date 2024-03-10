import java.util.Random;

public class Dice {

    private int numberOfDice;
    private Random random;

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
        this.random = new Random();

    }

    public int roll(){
        int sum = 0;
        for(int i = 0; i < numberOfDice; i++){
            int dieRoll = random.nextInt(6)+1;
            sum += dieRoll;
        }
        return sum;
    }


}
