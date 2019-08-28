public class Printing {

    public static void printStars(int amount ) {
        //System.out.println("");
        while(amount>0){
            
           // System.out.println("");
        System.out.print("*");
        amount--;
        
        }
        System.out.println();
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
    }
    

    public static void printSquare(int sideSize) {
        // 39.2
        
            int count = 0;
            while(count <sideSize)
            {
                printStars(sideSize);
                count++;
            }
        
        //System.out.println("");
        
    }

    public static void printRectangle(int width, int height) {
        
        
        // 39.3
        while(height>0){
            printStars(width);
            height--;
        }
        
        
    }

    public static void printTriangle(int size) {
        
        
        int count = 1;
        while(count<=size)
        {
            printStars(count);
            count++;
            
        }
        //System.out.println("");
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
      
       // here to see that the printout looks correct
        System.out.println(); 
       printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();
        System.out.println("\n---");  // printing --- to separate the figures
       // System.out.println("");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
