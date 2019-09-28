public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning<=end) {
            int middle = (beginning + end) / 2; //Find the middle of the index
           
            if (array[middle] == searchedValue) { //Check whether the array[middle] equals searched value. If so return true
                return true;
            }
            
            if(beginning==end){ //When this happens and array[middle] == searchedValue (Because when the numbers match , beginning and end is same. Thats the searched value is compared first )  , The number doesn't exist. 
                return false;
            }
            
            if(array[middle]>searchedValue){ 
                end = middle; // If the array[middle] is greater than searched , then the searched value lies to left of the middle value (or can be middle itself) . So the middle value is set as end of index
            }
            if(array[middle]<searchedValue){
                beginning = middle+1; //If the array[middle] is smaller than searched, then the searched value lies to right of the middle value (Cannot be the middle value though). So middle value +1 is set as starting point of index.
            }
            

        }  
        return false;
    }
}

//Suggested Solution
//        while (beginning <= end) {
//
//            int middle = (beginning + end) / 2;
//
//            if (array[middle] == searchedValue) {
//
//                return true;
//
//            }
//
// 
//
//            // restrict the search area 
//
//            if (searchedValue > array[middle]) {
//
//                beginning = middle + 1;
//
//            } else {
//
//                end = middle - 1;
//
//            }
//
//        }