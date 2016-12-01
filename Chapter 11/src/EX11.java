import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX11 {
    public Set<Integer> symmetricSetDifference(Set<Integer> list, Set<Integer> list2) {
        Set<Integer> result = new HashSet<>(list);
        list.retainAll(list2);
        result.addAll(list2);
        result.removeAll(list);

        return result;
    }
}
