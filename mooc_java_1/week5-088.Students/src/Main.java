
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // write here the main program
        
        
      /* Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
       */
      Scanner userInput =new Scanner(System.in);
      ArrayList<Student> list = new ArrayList<Student>();

      while(true)
      {
          
        System.out.println("name: ");
        //store the user entered string in 'name' and then pass it to the object Student
        String name = userInput.nextLine();
        
        //If user enters nothing, then break and come out of loop
        if(name.isEmpty())
        {
            break;
        }
        
       System.out.println("studentnumber: ");

       String studentnumber = userInput.nextLine();
       if(studentnumber.isEmpty())
       {
           break;
       }
       
       // Pass name and studentnumber as argument to Student Object .
       Student newStudent = new Student(name,studentnumber);
       
       //now add that to the Array of Student object called 'list'
       list.add(newStudent);
       
      }
        
        //This for loop to print on separate lines , as every object of Student contains both name and number. so we iterate through the array.
        for(Student names : list)
        {
            System.out.println(names);
        }
        
        
        //Need to find whether the user entered term is present in any of the names, If so print that student's name and number 
        System.out.println("Give search term");
        String searchTerm = userInput.nextLine();                               //Store user search term in string
        System.out.println("Result: ");
        Student forSearchTerm = new Student(searchTerm,"");                     //We need to give the user input string as a argument in the Student object
        
        //Iterate through the names in the list
        for(Student names: list)    
        {
           String nameOfStudent = names.getName();                              // Store the name of the student as a String
           if(nameOfStudent.contains(searchTerm))                               //If that string contains the search term, then print the whole name+num
           {
               System.out.println(names);                                       //prints the name and num  
           }
        }
      
    }
}


/*
Use this code in the end , instead of what's used

System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
 
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
*/

