public class Main {

    public static void main(String[] args) {
        /*
        GenericStack<Integer> s = new GenericStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        */

        GenericQueue<Integer> q = new GenericQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.isEmpty());
    }
}
