
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a num: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another num: ");
        int num2 = Integer.parseInt(reader.nextLine());
        double q = (double)num1/num2;
        System.out.println("Division: "+ num1 + "/" + num2 +"=" + q) ;

        // Implement your program here. Remember to ask the input from user.
    }
}
