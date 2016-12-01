import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by Julius on 30-08-2016.
 */
public class EX07 {

    public void countCommon(LinkedList<Integer> list, LinkedList<Integer> list2) {
        Set<Integer> matches = new HashSet<>(list);
        matches.retainAll(list2);
        System.out.println(matches.size());
    }
    //Min første metode inden jeg læste bogen....
    public void countCommon2(LinkedList<Integer> list, LinkedList<Integer> list2) {
        Set<Integer> temp1 = new HashSet<>(list);
        Set<Integer> temp2 = new HashSet<>(list2);
        LinkedList<Integer> temp3 = new LinkedList();

        Iterator<Integer> templist1 = temp1.iterator();
        Iterator<Integer> templist2 = temp2.iterator();

        while (templist1.hasNext()) {
            int number = templist1.next();
            temp3.add(number);
        }

        while (templist2.hasNext()) {
            int number = templist2.next();
            temp3.add(number);
        }

        Collections.sort(temp3);

        LinkedList<Integer> test = new LinkedList<>();

        for (int i = 0; i < temp3.size() - 1; i++) {
            if (temp3.get(i) == temp3.get(i + 1)) {
                test.add(temp3.get(i));
            }
        }
        System.out.println(test.size());

    }
}
