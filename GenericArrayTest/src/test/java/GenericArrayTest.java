import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julius on 15-09-2016.
 */
public class GenericArrayTest {
    GenericArray<String> list = new GenericArray<String>();
    @Before
    public void setUp() throws Exception {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("3");
        list.add("7");
        list.add("3");
        list.add("7");
        list.add("7");

        for(int i = 0; i < 60; i++){
            list.add("9");
        }


    }
    @Test
    public void add() throws Exception {
        int tmp = list.size();
        assertEquals(tmp + 1, list.size());
        assertEquals(list.get(list.size() -1), "2");
    }

    @Test
    public void add1() throws Exception {
        int tmp = list.size();
        list.add(5, "6");
        assertEquals(tmp + 1, list.size());
        assertEquals(list.get(5), "6");
    }

    @Test
    public void isEmpty() throws Exception {
        assertNotEquals(list.get(0), null);
    }

    @Test
    public void reSizeList() throws Exception {
        int tmp = list.getCapacity();
        list.reSizeList();
        assertEquals(list.getCapacity(), tmp * 2);
    }

    @Test
    public void size() throws Exception {
        int tmp = list.size();
        assertNotEquals(tmp, list.size()+ 1);
    }

    @Test
    public void get() throws Exception {
        assertEquals(list.get(0), "1");
    }

    @Test
    public void clear() throws Exception {
        list.clear();
        assertEquals(list.size(), 0);
        assertEquals(list.getCapacity(), 10);
    }

    @Test
    public void indexOf() throws Exception {
        assertEquals(list.indexOf("3"), 2);
    }

    @Test
    public void lastIndexOf() throws Exception {
        assertEquals(list.lastIndexOf("3"), 7);
    }

    @Test
    public void set() throws Exception {
        list.set(5, "3");
        assertEquals(list.get(5), "3");
    }

    @Test
    public void remove() throws Exception {
        int tmp = list.size();
        String tmp2 = list.get(3);
        list.remove(3);

        assertNotEquals(list.get(3), tmp2);
        assertEquals(tmp - 1 , list.size());
    }

    @Test
    public void removeO() throws Exception {
        list.removeO("3");
        assertEquals(list.contains("3"), false);
    }

    @Test
    public void shift() throws Exception {
        list.set(3, null);
        list.shift();
        assertNotEquals(list.get(3), null);
        System.out.println(list);
    }

    @Test
    public void cutArray() throws Exception {
        int tmpCapacity = list.getCapacity();
        list.removeO("9");
        assertEquals(tmpCapacity / 2, list.getCapacity());
    }

    @Test
    public void contains() throws Exception {
        list.add("3");
        assertEquals(list.contains("3"), true);
    }

    @Test
    public void getCapacity() throws Exception {
        assertEquals(list.getCapacity(), 10);
    }

}