/**
 * Created by Julius on 27-09-2016.
 */
public class GenericStack<T> implements stackInterface<T> {
    private T[] list;
    private int size = 0;
    private int capacity = 0;

    public GenericStack() {
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
