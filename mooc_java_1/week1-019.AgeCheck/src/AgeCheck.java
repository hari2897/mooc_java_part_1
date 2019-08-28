
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int num = Integer.parseInt(reader.nextLine());
        
        if(num > -1 && num < 121)
        {
            System.out.println("OK");
        }
        else{
            System.out.println("Impossible!");
        }

    }
}
