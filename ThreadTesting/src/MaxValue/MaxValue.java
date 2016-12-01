package MaxValue;

import java.util.Random;

/**
 * Created by Julius on 29-09-2016.
 */
public class MaxValue extends Thread {
    private int lo, hi;
    private int[] arr;
    private int ans = 0;

    public MaxValue(int[] arr, int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    @Override
    public void run() {
        int maxV = Integer.MIN_VALUE;
        for (int i = lo; i < hi; i++) {
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
        }
        ans = maxV;
    }
    public static int sum(int[] arr) throws InterruptedException {
        int len = arr.length;
        int ans;

        // Create and start 4 threads.
        MaxValue[] ts = new MaxValue[4];
        for (int i = 0; i < 4; i++) {
            ts[i] = new MaxValue(arr, (i * len) / 4, ((i + 1) * len / 4));
            ts[i].start();
        }

        // Wait for the threads to finish and sum their results.
        int maxV = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            ts[i].join();
            if(ts[i].ans > maxV){
                maxV = ts[i].ans;
            }
        }
        ans = maxV;

        return ans;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {8, 2, 2, 6, 1, 5, 3, 3, 2, 3, 1, 7};
        /*Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1100);
        }
        */
        int sum = sum(arr);
        System.out.println("Max Value: " + sum);
    }
}
