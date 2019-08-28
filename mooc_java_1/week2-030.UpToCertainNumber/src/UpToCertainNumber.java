
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num =1 ;
        int entered;
        System.out.print("Upto what number?: ");
        entered = Integer.parseInt(reader.nextLine());
        while(num <= entered){
            System.out.println(num);
            num++;
            
            
        }
        // Write your code here
        
    }
}
