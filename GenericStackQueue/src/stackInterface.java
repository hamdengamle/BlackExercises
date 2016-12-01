/**
 * Created by Julius on 27-09-2016.
 */
public interface stackInterface<T> {
    void push(T o);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
    String toString();
}
