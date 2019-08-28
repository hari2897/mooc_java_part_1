import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Type a name: ");
        String name = read.nextLine();
        int i=1;
        int x=0;
        if(name.length()>2)
        {

            while(i <4)
            {
                System.out.println(i + ".Character:  "+name.charAt(x));
                i++;
                x++;
            }
        }


    }
}
