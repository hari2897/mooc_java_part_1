
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your age? :  ");
        int num = Integer.parseInt(reader.nextLine());
        if (num>=18){
            System.out.println("you have reached majority!");
            
        }
        else{
            System.out.println("You have not reached majority!");
        }
    }
}
