import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Enter another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 == num2)
        {
            System.out.println("The numbers are equal!");
        }
        else if(num1 > num2){
            System.out.println("Greater number: "+ num1);
        }
        else {
            System.out.println("Greater number: "+ num2);
        }
    }
}
