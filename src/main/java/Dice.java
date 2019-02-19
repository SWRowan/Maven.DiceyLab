import java.util.Random;


public class Dice {
    Random randoNum = new Random();
    int result = 0;
    int diceTotal;
    int diceNum;


    public Dice(){
        diceTotal = 6;
        diceNum = 1;
    }


    public Dice(int numofDice) {

                diceTotal = numofDice*6;
                diceNum = numofDice;


    }

    public int rollDice(){

            result = randoNum.nextInt(diceTotal);
            if(result < diceNum){
                result+=diceNum;
            } else if(result <= diceTotal) {
                result++;
            }
            return result;

    }

    public int tossAndCount(int numberOfRolls){
        result = 0;

        for (int i = 0; i < numberOfRolls; i++) {
                result = rollDice();
            //System.out.println(result);
        }

    return result;



    }

    public static void main(String[] args) {
        Dice craps = new Dice(2);

        craps.tossAndCount(100);
    }

}
