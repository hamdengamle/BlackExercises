import java.util.LinkedList;

/**
 * Created by Julius on 03-11-2016.
 */
public class StackRepository<T> implements stackInterface<T>, Container {
    private T[] list;
    private int size = 0;
    private int capacity = 0;

    @Override
    public Iterator getIterator() {
        return new StackRepository.StackIterator();
    }

    private class StackIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if(index < size){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return list[index++];
            }
            return null;
        }
    }

    public StackRepository() {
        this.capacity = 10;
        list = (T[]) new Object[capacity];
    }

    public void push(T o) {
        if (size >= capacity) {
            this.capacity = capacity * 2;
            T newList[] = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
        }
        list[size] = o;
        size++;
    }

    public T pop() {
        T o = list[size - 1];
        size--;

        if (size <= (capacity / 2)){
            this.capacity = capacity / 2;
            T newList[] = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
        }

        return o;
    }

    public T peek() {
        return list[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public String toString() {
        String st = "";

        for (int i = 0; i < size; i++) {
            st += list[i] + " ";
        }
        return st;
    }

}