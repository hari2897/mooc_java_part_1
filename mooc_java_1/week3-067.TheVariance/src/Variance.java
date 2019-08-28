import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list)

    {
        int summer = 0 ;
        for(int i=0 ; i<list.size(); i++ )
        {
             summer += list.get(i);

        }
        return summer;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list)
    {
       double average = (double)sum(list)/ list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list)

    {
        // write code here
        double variancesum =0;
        double avg = average(list);
        //double something = (list.get(i)-average(list));
        for(int i=0; i<list.size() ; i++)
        {

            variancesum += (double)Math.pow((list.get(i)-avg),2);



        }
        double variancefinal = (double)variancesum/(list.size()-1);
        return variancefinal;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println(average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
