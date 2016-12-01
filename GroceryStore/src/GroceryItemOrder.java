/**
 * Created by Julius on 25-08-2016.
 */
public class GroceryItemOrder {

    private String name;
    private int quantity;
    private double price;
    private double totalCost;


    public GroceryItemOrder(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
       this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    //toString
    public String toString(){
        return "";
    }
}
