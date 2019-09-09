
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    // User command like     Person pekka = new Person("Pekka", 15, 2, 1993); is referred to here. this is the birthday which has to be compared with today's date
    public Person(String name, int dd, int mm, int yy) {

        this.name = name;
        this.birthday = new MyDate(dd, mm, yy);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate todayDate = new MyDate(day, month, year);       //This gives the present date (Today's date)

        int age = this.birthday.differneceInYears(todayDate); // Comparing (differenceInYears) the today's date with the birthday (this.birthday) and storing the difference in a variable age(int)

        return age;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

    public boolean olderThan(Person compared) {
        //Comparing ages based on birthday

        return this.birthday.earlier(compared.birthday);     //In martin.olderThan(pekka)) for eg ,  compares the birthday of martin (this.birthday) to that of pekka (compared.birthday .If martin is older , return true, else false 
    }

    public Person(String name, MyDate birthday) {           //constructor sets the given MyDate-object to be the birthday of the person
        this.name = name;           
        this.birthday = birthday;

    }

    public Person(String name) {       // constructor sets the current date (i.e., the date when the program is run) to be the birthday of the person
        this.name = name;
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate todayDate = new MyDate(day, month, year);           //The present date of running this program (today) is stored in MyDate object called todayDate 
        this.birthday = todayDate;                                 //the present date is set as the biirthday of the object 
    }
}
