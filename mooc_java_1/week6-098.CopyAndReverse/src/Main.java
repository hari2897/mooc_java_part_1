
import java.util.Arrays; 
public class Main {
    
    //function to copy the integers of array to new array
    public static int[] copy(int[] array)
    {
        int arrayLength = array.length;
        int[] copied = new int[arrayLength];    //declaring new array copied to which the ints will be copied in order.
        for(int i=0; i<arrayLength;i++) // start the index from 0 to copy in same order.
        {
            copied[i]=array[i];//storing the int in reverse order in new array copied.
        }
       
        return copied;
    }

    public static int[] reverseCopy(int[] array)
    {
         int arrayLength = array.length;
        int[] revInt = new int[arrayLength]; //declaring new array copied to which the ints will be copied in REVERSE order.
        int x= 0;
        for(int i=arrayLength;i>0;i--)  //Start the index from the end to copy the last int first.
        {
            revInt[x] =  array[i-1];    //i-1 , otherwise it will go outOfBounds.
            x++;
        }
        return revInt;

    }
 
 

    public static void main(String[] args) {
        // write testcode here
    // int[] original = {1, 2, 3, 4};
    // int[] copied = copy(original);

    // // change the copied
    // copied[0] = 99;

    // // print both
    // System.out.println( "original: " + Arrays.toString(original));
    // System.out.println( "copied: " + Arrays.toString(copied));

    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
}
