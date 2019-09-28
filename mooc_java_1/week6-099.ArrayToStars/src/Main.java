
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayAsStars(array);

      
        
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int i = 0; i < array.length; i++) // Iterate through the numbers in the array
        {
            int number = array[i]; // Store in a new variable to use it to print the number of stars.
            for (int x = 0; x < number; x++) // iterate the number of the times of the number stored in that array cell.
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
