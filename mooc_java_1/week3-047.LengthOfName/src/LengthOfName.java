
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here

        System.out.println("Type name: ");
        String name = reader.nextLine();
        System.out.println("The length is " + calculateCharacters(name));


    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text)
    {
        int lengthOf = text.length() ;
        return lengthOf;
    }
}
