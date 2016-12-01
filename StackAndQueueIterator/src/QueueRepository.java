import java.util.LinkedList;

/**
 * Created by Julius on 03-11-2016.
 */
public class QueueRepository<T> implements queueInterface<T>, Container {
    private LinkedList<T> list;
    private int first = 0;
    private int countE = 0;

    @Override
    public Iterator getIterator() {
        return new QueueRepository.QueueIterator();
    }

    private class QueueIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return list.get(index++);
            }
            return null;
        }
    }

    public QueueRepository(){

        list = new LinkedList<>();
    }


    public void add(T o) {
        list.add(o);
        countE++;
    }

    public T remove() {
        T o = list.get(first);
        list.remove(first);
        countE--;
        return o;
    }

    public boolean isEmpty() {
        return countE <= 0;
    }

    public T peek() {
        return list.get(first);
    }

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