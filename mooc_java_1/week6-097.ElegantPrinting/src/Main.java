
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {                            //function to print the numbers of the array in single line with comma 
        // Write code here                                                      //the last number should not end with a comma after it.
        
        for(int i=0 ; i<(array.length) ; i++){                                  //iterate until i becomes the length of array length (          
            if(i==(array.length)-1)                                                   
            {
                System.out.println(array[i]);
            }
            else
            {System.out.print(array[i]+",");}
            
        }
       

    }
}
