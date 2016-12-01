
/**
 * Created by Julius on 13-09-2016.
 */
public class GenericArray<T> {

    private T[] list;
    private int capacity = 0;
    //private int fSize = size();

    // O (n)
    public GenericArray(){
        this.capacity = 10;
        list = (T[]) new Object[capacity];
    }

    // ADD OBJECT // O(n)

    public void add(T o) {
        if(size() >= this.capacity){
            reSizeList();
        }
        for(int i = 0; i < list.length; i++){
            if(this.list[i] == null){
                this.list[i] = o;
                break;
            }
        }
    }
    // ADD OBJECT TO INDEX // O(n^2) pga shift()
    public void add(int index, T o){
        //n
        if(size() >= this.capacity){
            reSizeList();
        }
        //n^2
        for(int i = size() - 1; i >= index; i--){
            list[i+1] = list[i];
        }
        list[index] = o;
        //n^2
        shift();
    }

    // IS LIST EMPTY // O(1)
    public boolean isEmpty(){
        return size() == 0;
    }

    // DOUBLE LIST // O(n)
    public void reSizeList(){
        this.capacity = 2 * list.length;
        T newList[] = (T[]) new Object[capacity];
        for(int i = 0; i < this.list.length; i++){
            newList[i] = this.list[i];
        }
        this.list = newList;
    }
    // LIST SIZE // O(n)
    public int size(){
        int count = 0;
        for(int i = 0; i < this.list.length; i++){
            if(list[i] != null) {
                count++;
            }
        }
        return count;
    }
    // GET INDEX // O(1)
    public T get(int index){
        return this.list[index];
    }

    // CLEAR LIST// O(1)
    public void clear(){
        this.capacity = 10;
        this.list = (T[]) new Object[this.capacity];
    }

    // GET OBJECT OF INDEX // O(n)
    public int indexOf(T o){
        int index = -1;
        for(int i = 0; i < list.length; i++){
            if(list[i] == o){
                index = i;
                return index;
            }
        }
        return index;
    }

    // OBJECT OF LAST INDEX // O(n)
    public int lastIndexOf(T o){
            int index = -1;
            for(int i = 0; i < list.length; i++){
                if(list[i] == o){
                    index = i;
                }
            }
            return index;
    }

    // SET INDEX // O(1)
    public void set(int index, T o){
        this.list[index] = o;
    }

    // REMOVE INDEX // O(n^2) pga shift // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    public void remove(int index) {
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                list[i] = null;
            }
        }
        shift();
    }

    // REMOVE OBJECT // O(n^2) // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    public void removeO(T o) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == o) {
                list[i] = null;
            }
        }
        shift();
    }

    // SHIFTING LIST // O(n^2) // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    public void shift() {
        for (int i = 0; i < list.length; i++) {
            if(list[i] == null){
                for(int j = i + 1; j < list.length; j++){
                    if(list[j] != null){
                        list[i++] = list[j];
                        list[j] = null;
                    }
                }
            }
            break;
        }
        cutArray();
    }
    // Halverer array //  O(n) // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    @SuppressWarnings("unchecked")
    public void cutArray(){
        double tmpC = 0.25 * list.length;
        int tmpC2 = (int) tmpC;

        if(size() <= tmpC2) {
            this.capacity = capacity / 2;
            T newList[] = (T[]) new Object[capacity];
            for (int i = 0; i < newList.length; i++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
        }
    }

    // LIST CONTAINS OBJECT // O(1) // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    public boolean contains(T o){
        for(int i = 0; i < list.length; i++){
            if( list[i] == o){
                return true;
            }
        }
        return false;
    }
    // giver capacity // O(1)
    public int getCapacity(){
        return this.capacity;
    }

    // toString // O(n) // BRUG CAPACITY ISTEDET FOR LENGTH FORDI .LENGTH KAN VÆRE LOOP I ARRAY
    public String toString(){
        String tmp = "[";
        if(get(0) == null){
            tmp += "";
        }
        else {
            tmp += get(0);
            for (int i = 1; i < this.list.length; i++) {
                //if (get(i) != null) {
                    tmp += ", " + get(i);
                //}
            }
        }
        return tmp + "]";
    }
}

