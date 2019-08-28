import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: ");
        String name = reader.nextLine();
        char one = firstCharacter(name);
        System.out.println("First Character: "+ one);

    }



    public static char firstCharacter(String name)
    {
        char firstChar = name.charAt(0);
        return firstChar;

    }
}
