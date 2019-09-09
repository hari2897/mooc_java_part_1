
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;

    }

    public void advance() // advance method that increments the days by 1 until 30
    {
            {
            if (this.day != 31) //Considering only 30 days in a month , Increment until i=30.
            {
                this.day += 1;                         //Increase day by 1
            }
            if (this.day == 31) //If this.day = 31 , reset the day to 1
            {
                this.day = 1;                        //Set day as 1 , if after i=30 

                if (this.month != 12 ) //If month is not 12 , increment month by 1 
                {
                    this.month += 1;
                }
                
                else {
                    this.month = 1;                   //Otherwise, set month to 1 ( happens after month = 12)
                }
                if (this.month == 1 && this.day ==1) {    //If month is 1 (after 12)  and day becomes 1 (after 30), then increment year by 1
                    this.year += 1;
                }

            }

        }




    }

    public void advance(int numberOfDays) // advance(5) will increase the date by 5 days
    {

     for(int i=0; i<numberOfDays ; i++){        //Call advance for numberOfDays entered
        advance();                         
    }
    }

    public MyDate afterNumberOfDays(int days) //this method increments the date according to number of days given as parameter
    {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);       //new MyDate object called newMyDate is created and the new incremented date is stored in that

        newMyDate.advance(days);                                        //newMyDays is incremented by number of days given as parameter

        return newMyDate;
    }

}
