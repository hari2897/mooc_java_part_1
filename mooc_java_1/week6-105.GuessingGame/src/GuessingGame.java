
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);

    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        int number = 0;
        for (int i = 0; i < maxQuestions; i++) {  //This is the max number of times question can be asked. in other words how many times the range of numbers can be halved
            if(lowerLimit==upperLimit){ //When both upper and lower limit is equal . We have reached the number , so break the loop instead of asking a question again
                break;
            }
            int half = average(lowerLimit, upperLimit); //store the middle number of the limits in variable half.
            boolean y_n;
            y_n = isGreaterThan(half); //Check whether user's number in mind is greater than the number 'half'.
            if (y_n == true) { //If the number in users mind is more than the shown (half) number , we can skip the half'th number. As user tells it's greater. So start the lower limit with one number bigger , half+1
                number = half + 1;

                lowerLimit = half + 1;

            } else {
                number = half; 

                upperLimit = half; //If the number is not greater , it can also be the number half. So we dont do half-1 , instead set upperLimit to half itself.
            }

        }
        System.out.println("The number you're thinking of is " + number+"."); //Numbr had th value of half stored. , When both upperlimit and lowerlimit gets equal , half becomes equal to upper/lower limit too. That is printed as user's number
        // write the guessing logic here
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = reader.nextLine();
        return answer.equals("y");

    }

    public int average(int firstNumber, int secondNumber) {
        int avg = (firstNumber + secondNumber) / 2;
        return avg;
    }
}
