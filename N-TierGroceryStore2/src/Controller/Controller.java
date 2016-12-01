package Controller;

import Businesslogic.BusinessLogic;
import Businesslogic.GroceryList2;

/**
 * Created by Julius on 30-11-2016.
 */
public class Controller {

    public static GroceryList2 getDataList(){
        BusinessLogic BL = new BusinessLogic();
        return BL.fetchGroceryList();
    }
}
