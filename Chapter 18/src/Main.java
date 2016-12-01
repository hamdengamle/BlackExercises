import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashIntSet hs = new HashIntSet();
        HashIntSet hs2 = new HashIntSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        //Exercise 1//
        hs.addAll(hs2);
        //Exercise 2//
        System.out.println(hs.containsAll(hs2));
        //Exercise 3//
        System.out.println(hs.equals(hs2));
        //Exercise 4//
        hs.removeAll(hs2);
        //Exercise 5//
        hs.retainAll(hs2);
        //Exercise 6//
        int[] array = hs.toArray();
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        //Exercise 7//
        System.out.println(hs.toString());

        System.out.println(hs);
    }
}
