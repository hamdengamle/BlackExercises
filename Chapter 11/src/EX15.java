import java.util.*;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX15 {

    public void maxOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        if(numbers.isEmpty()){
            System.out.println(numbers.size());
        }
        else {
            for (int num : numbers) {
                if (map.containsKey(num)) {
                    int count = map.get(num);
                    count++;
                    map.put(num, count);

                } else {
                    map.put(num, 1);
                }
            }

            int max = Collections.max(map.values());
            for (int i : map.keySet()) {
                if (map.get(i) == max) {
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}


/*
        for(int i = 0; i < numbers.size(); i++) {
            map.put(i, numbers.get(i));
        }

        while(it.hasNext()) {
            int number = it.next();
            if (map.containsKey(number)) {
                int count = map.get(number);
                map.put(number, count + 1);
            }
        }
        */
        /*
        for(int keyz : map.keySet()){
            int number = map.get(keyz);
            if(keyz)
        }
        */


