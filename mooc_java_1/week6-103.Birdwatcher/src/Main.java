
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner userInput = new Scanner(System.in);

        ArrayList<Bird> birdList = new ArrayList<Bird>(); // Store the object Bird that contains name and latName in this

        while (true) {
            System.out.println("?");
            String choice = userInput.nextLine(); //User inputs choice Add/Observation/Show/Quit

            if (choice.equals("Add")) {
                System.out.print("Name: ");
                String name = userInput.nextLine();

                System.out.print("Latin Name: ");
                String latinName = userInput.nextLine();

                Bird newBird = new Bird(name, latinName); //Store name and latin name in a Bird Class ( to classify them under the same umbrella)

                birdList.add(newBird); // A arrayList of type Bird is created and the Objet is added

            }

            if (choice.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observed = userInput.nextLine();

                //Iterate through each Bird in birdList and see if the name (getName) matches the Observed bird the user typed.
                //if yes, iterate Observation counter by 1 
                //else , display its not a bird
                for (Bird i : birdList) {
                    if (i.getName().equals(observed)) {

                        i.Observed();

                    } else {
                        System.out.println("This is not a bird!");
                    }
                }

            }

            if (choice.equals("Statistics")) {

                //Shows the name,,latin name and number of observations of each Bird
                for (Bird i : birdList) {
                    System.out.println(i.getName() + "(" + i.getLatin() + "):" + i.Observation() + " observations");
                }

            }

            if (choice.equals("Show")) {

                //Shows the detail of just one Bird by by iterating through all Birds in birdList and comparing with searched bird.
                //If they match, details of that bird is displayed
                System.out.print("What? ");
                String name = userInput.nextLine();

                for (Bird i : birdList) {
                    if (i.getName().contains(name)) {
                        System.out.println(i.getName() + "(" + i.getLatin() + "):" + i.Observation() + " observations");
                    }
                }
            }

            if (choice.equals("Quit")) {
                break;
            }

        }

    }

}
