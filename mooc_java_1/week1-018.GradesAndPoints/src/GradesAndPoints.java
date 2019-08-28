
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int num = Integer.parseInt(reader.nextLine());
        
        if(num > -1 && num < 30)
        {
            System.out.println("Grade: failed ");
        }
        
        else if(num > 29 && num < 35){
            System.out.println("Grade: 1");
        }
       
        else if(num > 34 && num < 40){
            System.out.println("Grade: 2");
        }
        
        else if(num > 39 && num < 45){
            System.out.println("Grade: 3");
        }
        
        else if(num > 44 && num < 50){
            System.out.println("Grade: 4");
        }
        
        else if(num > 49 && num < 61) {
            System.out.println("Grade: 5");
        }
    }
}
