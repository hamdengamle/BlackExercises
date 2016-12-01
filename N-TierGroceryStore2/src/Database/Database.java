package Database;

import Businesslogic.GroceryList2;
import Businesslogic.GroceryItemOrder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Julius on 30-11-2016.
 */
public class Database implements DAOInterface {

    public Scanner getGroceryData() {
        try{
            return new Scanner(new File("C:\\Users\\Julius\\IdeaProjects\\ntiergrocerystore\\src\\Database\\GroceryList.txt"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
