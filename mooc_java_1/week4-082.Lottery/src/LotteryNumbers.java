
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random randomNum = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();

    //    int i ;
        int rand;

        while (this.numbers.size()<7) {
            rand = this.randomNum.nextInt(39) + 1;
            if (!this.containsNumber(rand)) {
                this.numbers.add(rand);
            }
          // i++;
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers

        return this.numbers.contains(number);
    }
}
