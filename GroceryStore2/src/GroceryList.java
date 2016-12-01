/**
 * Created by Julius on 25-08-2016.
 */
public class GroceryList {
    private GroceryItemOrder[] itemList = new GroceryItemOrder[10];
    private int items = 0;

    public void addItem(GroceryItemOrder gi) {
        {
            itemList[items] = gi;
            this.items++;

            }
        }

    public void getTotalCost(){
        int data = 0;
        for(int i = 0; i < items; i++){
            data += itemList[i].getCost();
        }
        System.out.println("TotalCost: " + data + " Kr.");
    }

    public String toString() {
        String data = "";
        for (int i = 0; i < items; i++) {
            data += "Name: " + itemList[i].getName() + " Quantity: " + itemList[i].getQuantity() + " Price : " + itemList[i].getPrice() + " Kr." + " TotalCost: " + itemList[i].getCost() + " Kr." +"\n";
        }
        return data;
    }
}
