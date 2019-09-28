public class Book{

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year){
        //This class is to return the String of title and publisher and int value of year.

        this.title=title;
        this.publisher=publisher;
        this.year=year;

    }

    public String title(){
        return this.title;
    }

    public String publisher(){
        return this.publisher;
    }

    public int year(){
        return this.year;
    }

    public String toString(){
        return this.title + ", " + this.publisher + ", " + this.year;
    }


}