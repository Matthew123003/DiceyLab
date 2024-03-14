import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    @Test
    public void test1() {
        Dice dice = new Dice(2);//create dice
        int total = dice.roll();//roll dice

        Assert.assertTrue(total >= 2 && total <= 12);
    }
}