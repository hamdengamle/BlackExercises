import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Julius on 31-08-2016.
 */
public class EX08 {

    public static int shortest(Set<String> list) {
        int shortest = Integer.MAX_VALUE;
        if (list.isEmpty()) {
            shortest = 0;
        } else {
            for (String i : list) {
                if (i.length() < shortest) {
                    shortest = i.length();
                }
            }
        }
        return shortest;
    }
}
