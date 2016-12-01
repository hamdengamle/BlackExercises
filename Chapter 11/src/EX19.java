import java.util.*;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX19 {

    public int minOccurrences(Map<String, Integer> numbers) {
        Map<Integer, Integer> count = new TreeMap<>();
        numbers.put("a", 3);
        numbers.put("ab", 3);
        numbers.put("abc", 2);
        numbers.put("abcd", 3);
        numbers.put("abcde", 2);
        numbers.put("abcdef", 5);
        numbers.put("abcdeg", 3);
        numbers.put("abcdeh", 2);

        int rarest = 0;
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            for (String num : numbers.keySet()) {
                if (count.containsKey(numbers.get(num))) {
                    Integer value = count.get(numbers.get(num));
                    count.put(numbers.get(num), value + 1);
                } else {
                    count.put(numbers.get(num), 1);
                }
                Integer min = Collections.min(count.values());
                for (int i : count.keySet()) {
                    if (count.get(i) == min) {
                        rarest = i;
                        break;
                    }
                }
            }
            return rarest;
        }
    }
}

/* for (String num : numbers.keySet()) {
                if (map.containsKey(numbers.get(num)))
                    map.put(numbers.get(num), map.get(numbers.get(num)) +1);
                else {
                    map.put(numbers.get(num), 1);
                }
            }

             int max = Integer.MAX_VALUE;
            int rarest = 0;

            for (int i : list) {
                int count = Collections.frequency(list, i);
                if (count < max || (count == max && i < rarest)) {
                    max = count;
                    rarest = i;
                }
            }*/


