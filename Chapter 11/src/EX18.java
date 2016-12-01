import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX18 {
    public Map<String, String> reverse(Map<String, String> map1) {
        Map<String, String> result = new HashMap<>();
        map1.put("42", "Marty");
        map1.put("81", "Sue");
        map1.put("17", "Ed");
        map1.put("31", "Dave");
        map1.put("56", "Ed");
        map1.put("3", "Marty");
        map1.put("29", "Ed");

        for(String i : map1.keySet()){
            if(result.containsKey(map1.get(i))) {
                result.put(map1.get(i), result.get(map1.get(i)) + ", " + i);
            }
            else{
                result.put(map1.get(i), i);
            }
        }
        for(String i : result.keySet()){
            result.put(i, "[" + result.get(i) + "]");
        }
        return result;

    }
}


