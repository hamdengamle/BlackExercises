import java.util.Iterator;
import java.util.Set;

/**
 * Created by Julius on 31-08-2016.
 */
public class EX09 {

    public static boolean hasEven(Set<Integer> list) {
        Iterator<Integer> i = list.iterator();
        boolean hasEven = false;

        while(i.hasNext()){
            if(i.next() % 2 == 0) hasEven = true;
        }
        return hasEven;
    }
}
