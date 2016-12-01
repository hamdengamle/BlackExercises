import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX14 {

    public void intersect(Map<String, Integer> list, Map<String, Integer> list2){
        list.put("Jul", 1);
        list.put("Mane", 2);
        list.put("Dase", 3);
        list.put("Smil", 4);

        list2.put("Jul", 1);
        list2.put("Mane", 3);
        list2.put("Das", 3);
        list2.put("Smil", 8);
        Map<String, Integer> list3 = new HashMap<>();
        for(String get : list.keySet()) {
            for(String get2 : list2.keySet()){
                if(get.equals(get2) && list.get(get).equals(list2.get(get2))){
                    list3.put(get2, list2.get(get2));
                }
            }
        }
        System.out.println(list3);

    }
}

/*Map<String, Integer> list3 = new HashMap<>();

        for(String get : list.keySet()) {

            for(String get2 : list2.keySet()){

                if(list.get(get).equals(list2.get(get2)) && list.containsKey(get2)){

                    list3.put(get2, list2.get(get2));
                }
            }
        }
        System.out.println(list3);*/


        /*
        for(String name : list2.keySet()) {
                if (list2.containsKey(name) && list2.containsValue(list.get(name))) {
                    list3.put(name, list.get(name));
                }
            }
        }
        */

        //System.out.println(list3);
