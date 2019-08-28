
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {

        int len = text.length();
        String reversed = "";
        //int i =0;

        while (len > 0 )
        {
           char character = text.charAt(len-1);


             reversed = reversed + character;
           len--;


        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
