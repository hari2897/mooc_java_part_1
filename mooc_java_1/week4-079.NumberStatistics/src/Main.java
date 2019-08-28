
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
         
        int input = 0;
        
        
        while (input != -1){
           input = Integer.parseInt(reader.nextLine());
           
           if(input != -1){
            all.addNumber(input);

            if(input %2 == 0){
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
           }
           
           
        }
       // System.out.println("amt"+all.amountofNumbers());
        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        //System.out.println("amount of numbers: "+all.amountofNumbers());
        //  System.out.println("sum of even: "+stats.sum());
        //     System.out.println("average: " + stats.average());
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }
}
