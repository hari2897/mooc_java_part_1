
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word= reader.nextLine();


        System.out.print("length of end part: ");
        int num =  Integer.parseInt(reader.nextLine());
        int len = word.length();

        System.out.println("Result: "+word.substring(len-num));

    }
}