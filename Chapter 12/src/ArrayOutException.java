/**
 * Created by Julius on 22-09-2016.
 */
public class ArrayOutException extends Exception {
    private int index;
    public ArrayOutException(int index){
        this.index = index;
    }
    public String toString(){
        return "Array out of bound baby! " + index;
    }
}
