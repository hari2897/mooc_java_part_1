
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {

        int summer = 0;
        for(int i=0 ; i<list.size() ; i++)
        {
          summer += list.get(i);

        }
        return summer;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int sum1 = sum(list);
        double average = (double)sum1 / list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
//        System.out.println(sum(list));

        System.out.println("The average is: " + average(list));
    }
}
