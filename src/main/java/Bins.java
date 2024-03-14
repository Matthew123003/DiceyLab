import java.util.HashMap;

public class Bins {

    private int lowerTotal;

    private int upperTotal;

    private int[] resultHolder;

    public Bins(int lowerTotal, int upperTotal){
        this.lowerTotal = lowerTotal;
        this.upperTotal = upperTotal;
        resultHolder = new int[upperTotal - lowerTotal + 1];
    }

    public void incrementBin(int rollResult){
        resultHolder[rollResult - lowerTotal]++;
    }

    public int getBin(int rollResult){
        return resultHolder[rollResult - lowerTotal];
    }



}
