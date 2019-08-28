import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> one , ArrayList<Integer> two)
    {
        int num = 0;
        int size =two.size();

        for(int i = 0 ; i<size ; i++)
        {
            num = two.get(i);

            if(one.contains(num))
            {

            }
            else
            {
                one.add(num);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
       smartCombine(list1, list2);
       System.out.println(list1);
       System.out.println(list2);
    }

}
