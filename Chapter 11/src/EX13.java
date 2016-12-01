import java.util.*;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX13 {

    public boolean isUnique(Map<String, String> list){
        boolean contains = false;
        list.put("Marty", "Stepp");
        list.put("Stuart", "Je");
        list.put("Jessica", "John");
        list.put("Amanda", "John");
        list.put("Hal", "Miller");
        Set<String> valuesSet = new HashSet<>(list.values());

        if(valuesSet.size() == list.size()){
            contains = true;
        }

        return contains;
    }

    public boolean isUnique2(Map<String, String> list){
        boolean contains = false;
        list.put("Marty", "Stepp");
        list.put("Stuart", "Miller");
        list.put("Jessica", "John");
        list.put("Amanda", "Camp");
        list.put("Hal", "Cena");
        LinkedList<String> value = new LinkedList<>();

        for(String word : list.keySet()){
            String value2 = list.get(word);
            value.add(value2);
        }

        Set<String> valuesSet = new HashSet<>(value);

        if(valuesSet.size() == list.size()){
            contains = true;
        }

        return contains;
    }
}
