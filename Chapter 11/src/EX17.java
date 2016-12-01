import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX17 {
    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Je");

        map2.put("Marty", "Stepp");
        map2.put("Stuart", "Je");
        map2.put("Jessica", "John");

        boolean isSubMap = false;
        int count = 0;

        for (String i : map1.keySet()) {
                if ((map2.containsKey(i) && map2.containsValue(map1.get(i)))) {
                    count++;
                }
            }
        if(count == map1.size()) isSubMap = true;

        return isSubMap;
    }

}