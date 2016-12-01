import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Julius on 30-08-2016.
 */
public class EX03 {

    public void removeInRange(LinkedList<Integer> list, int start, int end) {
        Iterator<Integer> i = list.iterator();
        int j = 0;

        while (i.hasNext()) {
            if(i.next() % 2 == 0  && j >= start && j < end){
                i.remove();
            }
            j++;
        }
    }
}

        /*
        for(int i = list.get(start); i < list.get(end); i++){
            if(list.get(i).equals(value)){
                list.remove(i);
            }
        }
        */

