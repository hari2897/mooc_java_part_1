public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
        while(amount>0)
        {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int count = 1;
        while(count <amount+1)
        {
            System.out.print(" ");
            
            count++;
        }
        //System.out.println();
        // 40.1
    }

    public static void printTriangle(int size) {
        int count = 1;
        while(size > 0)
        {
            printWhitespaces(size-1);  
            printStars(count);
            count++;
            size--;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        
        
        // 40.3
         int count = 1;
        while(height> 0)
        {
            printWhitespaces(height-1);  
            printStars(count);
            count+=2;
            height--;
        }
         
        int i=0;
            while(i<2)
            {
                printWhitespaces(count/2 -2);
                printStars(3);
                i++;
            }
        
        
        
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        //printStars(4);
        System.out.println();
       
        printTriangle(5);
        System.out.println("---");
        xmasTree(7);
        System.out.println("---");
        xmasTree(15);
        printWhitespaces(2);
    }
}
