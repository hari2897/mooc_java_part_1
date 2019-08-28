
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum=0;
        int count =1 ;
        
        System.out.print("Until what? : ");
        int num = Integer.parseInt(reader.nextLine());
        
        while(count<=num){
           // System.out.println(count);
            sum = count + sum;
            count++;
        }
        System.out.println(sum);
    }
}
