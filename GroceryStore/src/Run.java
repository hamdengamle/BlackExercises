/**
 * Created by Julius on 29-08-2016.
 */
public class Run {
    public static void main(String[] args){
        GroceryItemOrder bread = new GroceryItemOrder("Brød", 1, 10);

        GroceryList ls = new GroceryList();
        ls.addItem(bread);
    }
}
