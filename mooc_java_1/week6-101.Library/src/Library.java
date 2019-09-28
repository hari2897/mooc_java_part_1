
import java.util.ArrayList;
public class Library{

    

    private ArrayList<Book> LibBooks; //All the added books are stored in this Arraylist
    
    public Library(){
        this.LibBooks = new ArrayList<Book>(); //The arraylist is initialized here so that this.LibBook can be used
    }
    public void addBook(Book addBook) {
        this.LibBooks.add(addBook); // Adds book to arrayList

    }

    public void printBooks() {
        for (Book book : this.LibBooks) {
            System.out.println(book); //Prints books inside LibBooks
        }
    }

    public  ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>(); //Return the matched books by storing it in new ArrayList ( arrayList because there can be more than one book that matches)
        for (Book book :this.LibBooks) {

           // if(book.title().contains(title)){
           if(StringUtils.included(book.title(), title)){ // StringUtils is used , compares both Strings in upperCase
                found.add(book);//If the StringUtils class returns true, book gets added becuase true means , they match
            }

        }
        return found;
    }
    
    public  ArrayList<Book> searchByPublisher(String Publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.LibBooks) {

            //if(book.publisher().contains(Publisher)){
            if(StringUtils.included(book.publisher(), Publisher)){
                found.add(book);
            }

        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.LibBooks) {

            if(book.year()==year){
                found.add(book);
            }

        }
        return found;
    }



}