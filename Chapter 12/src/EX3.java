import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Julius on 18-09-2016.
 */
public class EX3 {
    public void ex3(){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        ArrayList<Integer> array = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i <= 100; i++) {
            array.add(r.nextInt(10));
        }

        do {
            try {
                System.out.print("Index of array: ");
                int number = input.nextInt();


                // Display the result
                System.out.println("Number of index " + number + ": " + array.get(number));

                continueInput = false;
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Array is out of bound! try again");
                input.nextLine(); // Discard input
            }
            catch (InputMismatchException ex) {
                System.out.println("Integer is required!");
                input.nextLine(); // Discard input
            }
        }
        while (continueInput);
    }
}

