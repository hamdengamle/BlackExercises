import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));
        Set<String> list3 = new HashSet<>((Arrays.asList("Kathrine", "Julius", "Max1", "nigas")));
        Set<Integer> list4 = new HashSet<>(Arrays.asList(1, 3, 7, 9));
        Set<Integer> list4v2 = new HashSet<>(Arrays.asList(2, 4, 5, 6, 7));
        LinkedList<String> list5 = new LinkedList<>(Arrays.asList("a", "ab", "abc", "abc", "abc"));
        Map<String, String> maplist = new HashMap<String, String>();
        Map<String, String> maplist4 = new HashMap<String, String>();
        Map<String, Integer> maplist2 = new HashMap<String, Integer>();
        Map<String, Integer> maplist3 = new HashMap<String, Integer>();
        LinkedList<Integer> list6 = new LinkedList<>(Arrays.asList(3, 3, 7, 1, 6, 4, 1, 7 ,9 ,9, 4 , 4));
        //EX02 ex02 = new EX02();
        //System.out.println(ex02.alternate(list, list2));

        //EX03 ex03 = new EX03();
        //ex03.removeInRange(list, 1, 5);
        //System.out.println(list);

        //EX04 ex04 = new EX04();
        //ex04.partition(list, 5);

        //EX05 ex05 = new EX05();
        //ex05.sortAndRemoveDuplicates(list);
        //System.out.println(list);

        //EX06 ex06 = new EX06();
        //ex06.countUnique(list);

        //EX07 ex07 = new EX07();
        //ex07.countCommon(list, list2);

        //EX08 ex08 = new EX08();
        //System.out.println(ex08.shortest(list3));

        //EX09 ex09 = new EX09();
        //System.out.println(ex09.hasEven(list4));

        //EX10 ex10 = new EX10();
        //ex10.removeOddLength(list3);
        //System.out.println(list3);

        //EX11 ex11 = new EX11();
        //System.out.println(ex11.symmetricSetDifference(list4, list4v2));

        //EX12 ex12 = new EX12();
        //System.out.println(ex12.contains3(list5));

        //EX13 ex13 = new EX13();
        //System.out.println(ex13.isUnique(maplist));

        //EX14 ex14 = new EX14();
        //ex14.intersect(maplist2, maplist3);

        //EX15 ex15 = new EX15();
        //ex15.maxOccurrences(list6);

        //EX16 ex16 = new EX16();
        //System.out.println(ex16.is1to1(maplist));

        //EX17 ex17 = new EX17();
        //System.out.println(ex17.subMap(maplist, maplist4));

        //EX18 ex18 = new EX18();
        //System.out.println(ex18.reverse(maplist));

        EX19 ex19 = new EX19();
        System.out.println(ex19.minOccurrences(maplist2));

    }
}
