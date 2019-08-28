
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum=0;
        int count=0;
        while(count<=num){
        
            int power= (int)Math.pow(2,count);
            sum += power;
            count++;
            
            
            
        }
        System.out.println("The result is : "+ sum);
        
    }
}
