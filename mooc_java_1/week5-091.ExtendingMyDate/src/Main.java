
public class Main {

    public static void main(String[] args) {
        // test your code here
        // MyDate newDate = new MyDate(25,2,2018);
        // newDate.advance();
        // System.out.println(newDate);
        // newDate.advance(5);
        // System.out.println(newDate);

        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }

//Friday after  1 weeks is 2.3.2011
// Friday after  2 weeks is 9.3.2011
// Friday after  3 weeks is 16.3.2011
// Friday after  4 weeks is 23.3.2011
// Friday after  5 weeks is 30.3.2011
// Friday after  6 weeks is 7.4.2011
// Friday after  7 weeks is 14.4.2011

        System.out.println("This week's Friday is " + day); //25.2.2011
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790)); //5.3.2013

//the below code is to test advance method
//MyDate myDate = new MyDate(29, 12, 2011);
//for(int i=0; i<501 ;i++)
//{
//myDate.advance();
//        System.out.println(myDate);
//    }
}        
    }

