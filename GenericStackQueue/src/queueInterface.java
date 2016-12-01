/**
 * Created by Julius on 27-09-2016.
 */
public interface queueInterface<T> {
    void add(T o);
    T remove();
    boolean isEmpty();
    T peek();
    int size();
    String toString();
}
