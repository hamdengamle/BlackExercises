package ReverseHallo;
/**
 * Created by Julius on 29-09-2016.
 */
public class ReverseHallo implements Runnable {

    private static int count = 0;

    public ReverseHallo() {
        count++;
    }

    public void run() {
            if(count < 51){
                System.out.println("COUNT: " + count);
                Thread t = new Thread(new ReverseHallo());
                t.start();
                t.yield();
            }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ReverseHallo());
        t.start();
    }
}

