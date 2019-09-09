public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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


    public int differenceInYears(MyDate comparedDate)
    {
      
        int thisDate = convertToDate(this);                                     //The present date represented in number of days
        int otherDate = convertToDate(comparedDate);                            //The comparedDate is represented in number of days

        int differenceInDates = Math.abs(thisDate - otherDate);                 //Difference in the number of days ( Maths.abs is used for converting to positive value )
        return differenceInDates / 360;                                         //The difference in number of days is divided by 360 (considering only 30 days in a months) so it can be represent in number of years
       // int dayDiff = this.day - comparedData.day;
    }


    public int convertToDate(MyDate date){
       int inDays = date.day + date.month*30 + date.year*30*12;                 //Convert the date into the number of days
       return inDays;
    }

}
