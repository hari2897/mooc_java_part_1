public class StringUtils{

public static boolean included(String word, String searched){
    //This class is to convert the the two strings to compare to uppercase and also to remove unwanted whitespace before and after the strings

    String upperSearched = searched.toUpperCase(); //Convert STring to uppercase
    String upperWord = word.toUpperCase(); 
    upperWord = upperWord.trim(); //trim the whitespaces before and after string
    upperSearched = upperSearched.trim();
      if (upperWord == null || upperSearched == null){ //if any of the string is empty , return false
        return false;
    }
  
    return (upperWord.contains(upperSearched)); //check whether word constains the searched string, word is the book.title/book.publisher that gets iterated in class Library
  

}

   

}

