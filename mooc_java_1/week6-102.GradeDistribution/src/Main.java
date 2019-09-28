import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> marksArray = new ArrayList<Integer>() ;
        Grades grade = new Grades(marksArray);
        System.out.print("Enter the number/marks");
        while(true){
        int marks = Integer.parseInt(userInput.nextLine());
        if(marks==-1){
            break;
        }
        
        marksArray.add(marks);
        
         
        }

        System.out.println("Grade Distribution: ");
        System.out.println("5:"+grade.five());
        System.out.println("4:"+grade.four());
        System.out.println("3:"+grade.three());
        System.out.println("2:"+grade.two());
        System.out.println("1:"+grade.one());
        System.out.println("0:"+grade.zero());
        System.out.println(grade);
        
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
