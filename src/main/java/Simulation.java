public class Simulation {
    private int numberOfDies;
    private int numberOfTosses;

    Dice dice;
    Bins bins;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDies);
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
        for (int i = 0; i < numberOfTosses; i++) {
            dice.roll();
        }
    }

        public void printResults () {

        }
    }

