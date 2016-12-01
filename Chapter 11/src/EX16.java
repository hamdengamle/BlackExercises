import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX16 {
    public boolean is1to1(Map<String, String> list){
        boolean contains = false;
        list.put("Marty", "123-456");
        list.put("Stuart", "456-789");
        list.put("Jessica", "9101-3945");
        list.put("Amanda", "4320-2340");
        list.put("Hal", "2300-5564");

        Set<String> valuesSet = new HashSet<>(list.values());
        if(valuesSet.size() == list.size()){
            contains = true;
        }

        return contains;
    }
}
