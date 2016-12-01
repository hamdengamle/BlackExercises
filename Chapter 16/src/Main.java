import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedIntList list = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(-7);
        list.add(-8);
        list.add(8);


        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(-6);
        list2.add(5);
        list2.add(-7);
        list2.add(-8);
        list2.add(8);


        //exercise 1
        //list.set(0, 100); GODKENDT
        //exercise 2
        //System.out.println(list.max()); GODKENDT
        //exercise 3
        //System.out.println(list.isSorted()); GODKENDT
        //exercise 4
        //System.out.println(list.lastIndexOf(5)); GODKENDT
        //exercise 5
        //System.out.println(list.countDuplicates()); GODKENDT
        //exercise 6
        //System.out.println(list.hasTwoConsecutive()); GODKENDT
        //exercise 7
        //System.out.println(list.deleteBack()); GODKENDT
        //exercise 8
        //list.switchPairs();
        //exercise 9
        //list.stutter(); GODKENDT
        //exercise 10
        //list.stretch(3); GODKENDT
        //exercise 11
        //list.compress(); GODKENDT
        //exercise 13
        //list.transferFrom(list2); GODKENDT
        //exercise 14
        //list.removeAll(2); GODKENDT
        //exercise 15
        //System.out.println(list.notEquals(list2)); HALV GODKENDT?
        //exercise 16
        //LinkedIntList list3 = list.removeEvens(); GODKENDT
        //exercise 17
        //list.removeRange(3, 7); HALV GODKENDT?
        //exercise 18
        //list.doubleList(); HALV GODKENDT?
        //exercise 19
        //list.rotate(); GODKENDT
        //exercise 21
        //list.reverse(); GODKENDT

        System.out.println(list);

    }

}

