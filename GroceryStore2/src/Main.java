import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Julius on 29-08-2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        GroceryItemOrder Bread =  new GroceryItemOrder("Bread", 2, 10);
        GroceryItemOrder Apple =  new GroceryItemOrder("Apple", 1, 2);
        GroceryItemOrder Weed =  new GroceryItemOrder("Hashish", 2, 100);
        GroceryItemOrder Cola =  new GroceryItemOrder("Cola", 1, 15);
        Scanner sc = new Scanner(new File("C:/Users/Julius/IdeaProjects/GroceryStore2/src/GroceryList.txt"));

        /*
        GroceryList ls = new GroceryList();
        ls.addItem(Bread);
        ls.addItem(Apple);
        ls.addItem(Weed);
        ls.addItem(Cola);

        System.out.println(ls);
        ls.getTotalCost();
        */
        /*
        GroceryList2 ls2 = new GroceryList2();
        ls2.addItem(Bread);
        ls2.addItem(Apple);
        ls2.addItem(Weed);
        ls2.addItem(Cola);

        System.out.println(ls2);
        ls2.getTotalCost();
        */

        GroceryList2 ls3 = new GroceryList2();

        while(sc.hasNextLine()) {
            while(sc.hasNext()){
                ls3.addItem(new GroceryItemOrder(sc.next(), sc.nextInt(), sc.nextDouble()));
            }
        }
        System.out.println(ls3);
        ls3.getTotalCost();
    }
}
