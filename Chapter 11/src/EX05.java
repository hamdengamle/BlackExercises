import java.util.*;

/**
 * Created by Julius on 30-08-2016.
 */
public class EX05 {

    public void sortAndRemoveDuplicates(LinkedList list){
        Set<Integer> temp = new HashSet<>(list);
        list.clear();
        list.addAll(temp);
        Collections.sort(list);

    }
}
