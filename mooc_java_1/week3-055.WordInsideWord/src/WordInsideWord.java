
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Enter a word: ");
        String word1 = reader.nextLine();

        System.out.println("Enter search term: ");
        String word2 = reader.nextLine();

        int newword = word1.indexOf(word2);
        //System.out.println(word1.substring(newword));
        if(newword > -1 )
        {
            System.out.printf("The word '"+ word2 + "' is found in the word'"+word1+"'");
        }
        else
        {
            System.out.printf("The word '"+ word2 + "' is not found in the word'"+word1+"'");


        }


    }
}
