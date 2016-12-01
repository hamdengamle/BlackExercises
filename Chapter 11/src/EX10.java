import java.util.Iterator;
import java.util.Set;

/**
 * Created by Julius on 31-08-2016.
 */
public class EX10 {
    public static void removeOddLength(Set<String> list) {
        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            if (i.next().length() % 2 == 1) {
                i.remove();
            }
        }
    }
}
