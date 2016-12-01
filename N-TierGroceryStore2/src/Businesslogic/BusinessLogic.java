package Businesslogic;

import Database.Database;

import java.util.Scanner;

/**
 * Created by Julius on 30-11-2016.
 */
public class BusinessLogic implements BLInterface {
    Database db = new Database();

    public GroceryList2 fetchGroceryList() {
        GroceryList2 datalist = new GroceryList2();
        Scanner sc = db.getGroceryData();
        while (sc.hasNextLine()) {
            while (sc.hasNext()) {
                datalist.addItem(new GroceryItemOrder(sc.next(), sc.nextInt(), sc.nextDouble()));
            }
        }
        return datalist;
    }
}
