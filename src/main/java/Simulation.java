public class Simulation {
    int maxNum;
   //Bins bin1 = new Bins();
    //Dice dice = new Dice(2);
    public Simulation(){

    }

    public void runSim(int diceNum, int numOfRolls){
        maxNum = diceNum*6;
        double percent = 0;
        double percentToReturn = 0;
        Dice dice = new Dice(diceNum);
        Bins bin1 = new Bins(diceNum, maxNum);

        for (int j = 0; j < numOfRolls ; j++) {
            bin1.binEntry(dice.tossAndCount(numOfRolls));
        }

        for (int i = diceNum; i <= maxNum; i++) {
            percent = (double)bin1.getBin(i) / numOfRolls;
            percent *= 100;
            //percentToReturn = Math.round(percent);
            //System.out.println("" + i + " : " + bin1.getBin(i) + " : " + percentToReturn);
            System.out.printf("%d : %d : %.2f \n", i,  bin1.getBin(i), percent);
        }



    }


    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.runSim(6,100);

    }

}
