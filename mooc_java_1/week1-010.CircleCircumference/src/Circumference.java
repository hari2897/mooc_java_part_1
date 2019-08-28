
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        double Pie = Math.PI;
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = 2 * Pie * radius ;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
