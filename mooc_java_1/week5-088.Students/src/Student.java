/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imhakr
 */
public class Student {
     private String name ;
     private String studentNumber;
    public Student(String name , String studentNumber)
    {
        this.name = name;
        this.studentNumber= studentNumber;
        
    }
    // returns the student name for pekka.getName()  , Here pekka is a object of class Student
    public String getName()                                                 
    {
        //returns the entered name 
        return this.name;
        
    }
    
    public String getStudentNumber()
    {
        //returns the student number for pekka.getStudentNumber
        return this.studentNumber;
    }
    
    public String toString()
    {
        //when , sout(pekka) ; It needs to return the name and number
        return this.name+" ("+this.studentNumber+")";
               
    }
    
    
    
    
    
    
}
