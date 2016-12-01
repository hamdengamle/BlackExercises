import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Julius on 01-09-2016.
 */
public class EX12 {

    public boolean contains3(LinkedList<String> list){
        Map<String, Integer> map = new HashMap<String, Integer>();

        boolean contains3 = false;

        Iterator<String> it = list.iterator();

        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), 0);
        }

        while(it.hasNext()) {
            String word = it.next();
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }

        for(String word : map.keySet()){
            int count = map.get(word);
            if(count == 3) contains3 = true;
        }

        return contains3;
    }
}
