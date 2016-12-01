package SharedCounter;


/**
 * Created by Julius on 29-09-2016.
 */
public class SharedCounter implements Runnable {

    public SharedCounter(){

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new SharedCounter());
        t.start();
    }
}
