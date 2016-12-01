import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julius on 27-09-2016.
 */
public class GenericStackTest {
    GenericStack<Integer> s = new GenericStack<>();
    @Before
    public void setUp() throws Exception {
        s.push(1);
        s.push(2);
        s.push(3);
    }

    @Test
    public void push() throws Exception {
        int size = s.size();
        s.push(4);
        assertEquals(s.size(), size + 1);

        int peek = s.peek();
        assertEquals(peek , 4);
    }

    @Test
    public void pop() throws Exception {
        int size = s.size();
        int last = s.peek();

        s.pop();
        assertEquals(size - 1, s.size());

        int newLast = s.peek();
        assertNotEquals(last, newLast);
    }

    @Test
    public void peek() throws Exception {
        int peek = s.peek();
        int peekCompare = s.pop();

        assertEquals(peek, peekCompare);
    }

    @Test
    public void size() throws Exception {
        int size = s.size();
        s.push(5);
        assertNotEquals(size, s.size());
    }

    @Test
    public void isEmpty() throws Exception {
        s = new GenericStack<>();
        assertEquals(s.isEmpty(), true);
        s.push(1);
        assertNotEquals(s.isEmpty(), true);
    }

}