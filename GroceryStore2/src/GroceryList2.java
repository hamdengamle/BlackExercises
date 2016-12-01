import java.util.ArrayList;

/**
 * Created by Julius on 29-08-2016.
 */
public class GroceryList2 {

    ArrayList<GroceryItemOrder> itemList = new ArrayList<GroceryItemOrder>();

    public void addItem(GroceryItemOrder gi) {
        {
            itemList.add(gi);
        }
    }
    public void getTotalCost(){
        int data = 0;
        for(int i = 0; i < itemList.size(); i++){
            data += itemList.get(i).getCost();
        }
        System.out.println("TotalCost: " + data + " Kr.");
    }
    public String toString() {
        String data = "";
        for (int i = 0; i < itemList.size(); i++) {
            data += "Name: " + itemList.get(i).getName() + " Quantity: " + itemList.get(i).getQuantity() + " Price : " + itemList.get(i).getPrice() + " Kr." + " TotalCost: " + itemList.get(i).getCost() + " Kr." +"\n";
        }
        return data;
    }
}
