
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {

        //int[] smallArr = new int[array.length] ;
        int smallest = array[0]; //Initially assume the first element of input array is smallest for comparision

        for (int i = 0; i < array.length - 1; i++) { //Iterate through each int in array for array.length -1 ( otherwise it goes out of bounds )

            if (smallest > array[i + 1]) { // Compare the present int with the next int 
                smallest = array[i + 1]; // If the present int is greater than next , then , store  the next int ( array[i+1] ) in "smallest"
                //This way , "smallest" will always store the least value

            }

        }
        return smallest;

    }

    public static int indexOfTheSmallest(int[] array) {

        int index = 0;
        for(int i=0 ; i<array.length ; i++){
            
            if(array[i] < array[index]){  // If array[i] is smaller than array[0] , then replace index= 0 with value of i , index = i 9which would be smaller than array[0]  
                index = i;
            }
            
        }
        return index;
        
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        //https://cscircles.cemc.uwaterloo.ca/java_visualize/#mode=display Use this tool to visualize how it works
        int minIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int swap1 = array[index2]; // for array[100,200,300,400] if index1 = 2 (300), index2 = 3 (400) , then swap1 = 400 
        int swap2 = array[index1]; // swap2 = 300

        array[index1] = swap1; // array[2] = 400
        array[index2] = swap2; //array[3] = 300 , thus making array = array[100,200,400,300]

    }

    public static void sort(int[] array) {
//
//        The idea of selection sorting is this:
//
//    Move the smallest number of the array to index 0.
//    Move the second smallest number to the index 1.
//    Move the third smallest number to the index 2.
//    and so forth

//    Inspect the array starting from index 0. Swap the value in index 0 and the smallest value in the array starting from index 0.
//    Inspect the array starting from index 1. Swap the value in index 1 and the smallest value in the array starting from index 1.
//    Inspect the array starting from index 2. Swap the value in index 2 and the smallest value in the array starting from index 2.
//    and so forth
        for (int i = 0; i < array.length; i++) {
            int x = indexOfTheSmallestStartingFrom(array, i); //Finding the smallest number from index i ( i starts from 0 )
            swap(array, x, i);  //Swap the smallest number found in previous step 'x' and 'i' , where i is bigger than x. so [1,3,7,9,8,2,4] --> [1,2,7,9,8,3,4] 
            //The number 3 (index 1) goes to index 5 where the smaller number than 3 , ie 2 was.
            System.out.println(Arrays.toString(array)); //prints the array
        }

    }

    public static void main(String[] args) {
        // write testcode here

//        int[] values = {6, 3, 0, -1, 4};
//        System.out.println(indexOfTheSmallest(values));
//
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));
        int[] values = {3, -14, 6, 1, 7, 1, 3, 7, 5};
        System.out.println(indexOfTheSmallest(values));
        sort(values);
        System.out.println(smallest(values));

    }

}
