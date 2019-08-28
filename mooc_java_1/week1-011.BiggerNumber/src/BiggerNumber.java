
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int maximum = Math.max(num2, num1);
        System.out.println("The bigger number of the two numbers given was: " + maximum);

        // Implement your program here. Remember to ask the input from user
    }
}
