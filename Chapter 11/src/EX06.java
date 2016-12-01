import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Julius on 30-08-2016.
 */
public class EX06 {
    public void countUnique(LinkedList<Integer> list){
        Set<Integer> temp = new HashSet<>(list);
        System.out.println(temp.size());
    }
/*
    public void countUnique2(LinkedList<Integer> list){
        Set<Integer> temp = new HashSet<>();

        Iterator<Integer> itlist = list.iterator();
        while(itlist.hasNext()){
            temp.add(itlist.next());
        }
        list.clear();

        Iterator<Integer> templist = temp.iterator();
        while(templist.hasNext()){
            int number = templist.next();
            list.add(number);
        }
        System.out.println(list.size());
    }
    */
}
