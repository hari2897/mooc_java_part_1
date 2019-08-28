
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        
        System.out.print("Eneter 1st num: ");
        read = Integer.parseInt(reader.nextLine());
        System.out.print("Enter 2nd num :");
        read = read + Integer.parseInt(reader.nextLine());
        System.out.print("Enter 3rd num: ");
        read = read +Integer.parseInt(reader.nextLine());
        sum = read;

        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
