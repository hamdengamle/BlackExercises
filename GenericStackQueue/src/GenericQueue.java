import java.util.LinkedList;

/**
 * Created by Julius on 27-09-2016.
 */
public class GenericQueue<T> implements queueInterface<T> {

    private LinkedList<T> list;
    private int first = 0;
    private int countE = 0;

    public GenericQueue(){

        list = new LinkedList<>();
    }

    @Override
    public void add(T o) {
        list.add(o);
        countE++;
    }

    @Override
    public T remove() {
        T o = list.get(first);
        list.remove(first);
        countE--;
        return o;
    }

    @Override
    public boolean isEmpty() {
        return countE <= 0;
    }

    @Override
    public T peek() {
        return list.get(first);
    }

    @Override
    public int size() {
        return countE;
    }

    public String toString(){
        String st = "";

        for (int i = 0; i < countE; i++) {
            st += list.get(i) + " ";
        }
        return st;
    }
}
