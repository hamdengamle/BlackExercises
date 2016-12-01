/**
 * Created by Julius on 25-08-2016.
 */
public class GroceryList {

    Object[] itemList = new Object[10];

    public void addItem(GroceryItemOrder gi){
        for(int i = 9; i < itemList.length; i++){
            if(itemList[i].equals(null)){
                itemList[i] = gi;
            }
        }
    }
}
