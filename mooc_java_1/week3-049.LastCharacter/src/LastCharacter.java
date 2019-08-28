import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a name: ");
        String name = reader.nextLine();

        char last = lastCharacter(name);
        System.out.println("the last character is : "+ last);



    }

    public static char lastCharacter(String name)
    {
        return name.charAt((name.length())-1);
    }

}
