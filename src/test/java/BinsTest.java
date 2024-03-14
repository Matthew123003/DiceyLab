import junit.framework.TestCase;
import org.junit.Assert;

public class BinsTest extends TestCase {

    public void testIncrementBin() {
        Bins bins = new Bins(2,12);
        Integer expected = 1;

        bins.incrementBin(10);
        Integer actual = bins.getBin(10);

        Assert.assertEquals(expected, actual);
    }

    public void testGetBin() {
        Bins bins = new Bins(2,12);
        Integer expected = 1;

        bins.incrementBin(8);
        Integer actual = bins.getBin(8);

        Assert.assertEquals(expected, actual);

    }
}