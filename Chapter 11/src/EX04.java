import java.util.*;

/**
 * Created by Julius on 30-08-2016.
 */
public class EX04 {

    public void partition(LinkedList<Integer> list, int value) {
        LinkedList<Integer> temp = new LinkedList<>();
        Iterator<Integer> itlist = list.iterator();
        Iterator<Integer> itlist2 = list.iterator();


        while (itlist.hasNext()) {
            int number = itlist.next();
            if (number < value) {
                temp.add(number);
            }
        }

        while (itlist2.hasNext()) {
            int number = itlist2.next();
            if (number > value) {
                temp.add(number);
            }
        }
        list.clear();
        for(int i = 0; i < temp.size(); i++){
            list.add(temp.get(i));
        }
        System.out.println(list);
    }
}

