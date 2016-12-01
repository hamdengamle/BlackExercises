import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EX02 {

    public static LinkedList<Integer> alternate(LinkedList<Integer> list, LinkedList<Integer> list2){
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<Integer> kort = new LinkedList<>();
        LinkedList<Integer> lang = new LinkedList<>();

        if(list.size() <list2.size()){
            kort = list;
            lang = list2;
        }
        else{
            kort = list2;
            lang = list;
        }
        int MaxSize = Math.max(list.size(), list2.size());
        int MinSize = Math.min(list.size(), list2.size());

        for(int i = 0; i < MinSize; i++){
            list3.add(kort.get(i));
            list3.add(lang.get(i));
        }
        for(int i = MinSize; i < MaxSize; i++){
            list3.add(lang.get(i));
        }
        return list3;
        /*
        Iterator itlist = list.iterator();
        Iterator itlist2 = list2.iterator();

        while(itlist.hasNext() || itlist2.hasNext()) {
            if(itlist.hasNext()) list3.add((Integer) itlist.next());
            if(itlist2.hasNext()) list3.add((Integer) itlist2.next());
        }
        */
    }
}
