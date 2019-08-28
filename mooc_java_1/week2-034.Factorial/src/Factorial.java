import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int count=num-1;
        int sum = num;
        while(count>0)
        {
          sum= sum*(count);
            
           // sum = sum+count;
            count--;
          
        }
        System.out.println("The factorial is: "+sum);
        
    }
}
