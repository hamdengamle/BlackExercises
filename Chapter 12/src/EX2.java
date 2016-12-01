import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Julius on 18-09-2016.
 */
public class EX2 {
        public void ex2(){
            Scanner input = new Scanner(System.in);
            boolean continueInput = true;

            do {
                try {
                    System.out.print("Enter an integer: ");
                    int number = input.nextInt();
                    System.out.print("Enter second integer: ");
                    int number2 = input.nextInt();

                    // Display the result
                    System.out.println("The number entered is " + (number + number2));

                    continueInput = false;
                    }
                catch (InputMismatchException ex) {
                    System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                    input.nextLine(); // Discard input
                    }
                }
            while (continueInput);
            }
        }
