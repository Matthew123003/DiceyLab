public class Simulation {
    private int numberOfDies;
    private int numberOfTosses;

    //Dice dice;
    private Bins bins;

    public Simulation(int numberOfDies, int numberOfTosses, int lowerTotal, int upperTotal) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(lowerTotal,upperTotal);
    }

    public int getNumberOfDies() {
        return numberOfDies;
    }

    public void setNumberOfDies(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }

    public void setNumberOfTosses(int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }


    public void runSimulation() {
        Dice dice = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) {
            int sum = dice.roll();
            bins.incrementBin(sum);
        }
    }

        public void printResults () {
            StringBuilder sb = new StringBuilder();
            sb.append("***\n");
            sb.append("Simulation of ").append(numberOfDies).append(" dice tossed for ").append(numberOfTosses).append(" times.\n");
            sb.append("***\n");
            sb.append("\n");
            for()

        }

        //Simulation of 2 dice tossed for 1000000 times.
    public static void main(String[] args){


    }
    }

