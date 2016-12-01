import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedIntList {

    private ListNode front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the lis
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            //16.2 A Linked List Class 1005
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
            //Chapter 16 Linked Lists
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    //EXERCISE 1
    public void set(int index, int value) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }

    // EXERCISE 2
    public int max() {
        int max = Integer.MIN_VALUE;
        ListNode current = front;
        if (current == null) {
            throw new NoSuchElementException();
        } else {
            while (current != null) {
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }
        }
        return max;
    }

    //EXERCISE 3
    public boolean isSorted() {
        boolean isSorted = true;
        ListNode current = front;
        int sort = Integer.MIN_VALUE;

        while (current != null) {
            if (current.data >= sort) {
                sort = current.data;
            } else {
                isSorted = false;
            }
            current = current.next;
        }
        return isSorted;
    }

    //EXERCISE 4
    public int lastIndexOf(int value) {
        int currentIndex = 0;
        int lastIndexOf = -1;
        ListNode current = front;

        while (current != null) {
            if (current.data == value) {
                lastIndexOf = currentIndex;
            }
            currentIndex++;
            current = current.next;
        }
        return lastIndexOf;
    }

    //EXERCISE 5
    public int countDuplicates() {
        int duplicates = 0;

        ListNode current = front;
        int temp = Integer.MIN_VALUE;

        while (current != null) {
            if(current.data == temp){
                duplicates++;
            }
            else{
                temp = current.data;
            }
            current = current.next;
        }
        return duplicates;
    }

    //EXERCISE 6
    public boolean hasTwoConsecutive() {
        boolean hasConsec = false;

        ListNode current = front;

        int temp = Integer.MIN_VALUE;

        while (current != null) {
            if (current.data == temp + 1) {
                hasConsec = true;
            } else if (current.data > temp) {
                temp = current.data;
            }
            current = current.next;
        }
        return hasConsec;
    }

    //EXERCISE 7
    public int deleteBack() {
        int value = 0;

        ListNode current = front;
        if (current == null) throw new NoSuchElementException();

        else {
            while (current != null) {
                if (current.next.next == null) {
                    value = current.next.data;
                    current.next = null;
                }
                current = current.next;
            }
        }
        return value;
    }

    //EXERCISE 8
    public void switchPairs() {
        ListNode current = front;
        while (current.next != null && current.next.next != null) {
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            current = current.next.next;
        }
    }

    //EXERCISE 9
    public void stutter() {
        ListNode current = front;
        while (current != null) {
            current.next = new ListNode(current.data, current.next);
            current = current.next.next;
        }
    }

    //EXERCISE 10
    public void stretch(int n) {
        ListNode current = front.next;
        ListNode tempL = front;
        ListNode newL = null;

        if (n <= 0) front = null;

        while (tempL != null) {
            for (int i = 1; i < n; i++) {
                newL = new ListNode(tempL.data);
                tempL.next = newL;
                newL.next = current;
                tempL = tempL.next;
            }
            tempL = current;
            if (current != null)
                current = current.next;
        }
    }

    //EXERCISE 11
    public void compress() {
        ListNode current = front;
        while (current != null && current.next != null) {
            current.data = current.data + current.next.data;
            current.next = current.next.next;
            current = current.next;
        }
    }

    //EXERCISE 12

    //EXERCISE 13
    public void transferFrom(LinkedIntList list2) {
        ListNode current = list2.front;

        while (current != null) {
            add(current.data); //tilføjer til list1 front;
            current = current.next;
        }
        list2.front = null; //empty list
    }

    //EXERCISE 14
    public void removeAll(int value) {
        ListNode current = front;
        ListNode temp;
        while (current != null && current.next != null) {
            if (current.next.data == value) {
                temp = current.next.next;
                current.next = null;
                current.next = temp;
            } else {
                current = current.next;
            }
        }
    }

    //EXERCISE 15
    public boolean notEquals(LinkedIntList list2) {
        boolean notEquals = true;
        if (list2.size() != size()) {
            notEquals = false;
        }
        for (int i = 0; i < list2.size(); ++i) {
            if (list2.get(i) != get(i))
                notEquals = false;
        }
        return notEquals;
    }

    //EXERCISE 16  VED IKKE NMED DEN HER
    public LinkedIntList removeEvens() {
        ListNode current = front;
        LinkedIntList evenList = new LinkedIntList();
        LinkedIntList oddList = new LinkedIntList();

        while (current.next != null) {
            int evenNum = current.data;
            int oddNum = current.next.data;
            evenList.add(evenNum);
            oddList.add(oddNum);
            current = current.next.next;
        }
        front = oddList.front;
        return evenList;
    }

    //EXERCISE 17
    public void removeRange(int start, int end) {

        try {
            if (start < 0 || end < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = end; i >= start; i--) {
                remove(i);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    //EXERCISE 18 irriterende!!!!1
    public void doubleList() {
        ListNode current = front; // front of this list
        int size = size();

        for (int i = 0; i < size; i++) {
            add(current.data);
            current = current.next;
        }
    }

    //EXERCISE 19 sværrrrrrr
    public void rotate() {
        if (front != null && front.next != null) { //sikrer mig at min liste indeholder mere end 1 element
            ListNode tmp = front; // ny listnode til at holde den front
            front = front.next; //front er nu lig med den næste i rækken hvilket vil sige den sletter den første og erstatter den med nr 2.
            tmp.next = null; // min nye listnode skal referere til noget ellers kører den 4 ever??

            ListNode current = front;
            //kører i loop for at nå frem til sidste index.
            while (current.next != null) {
                current = current.next;
            }
            //tilføjer til det sidste index
            current.next = tmp;
        }
    }
    //EXERCISE 20 ikke tid

    //EXERCISE 21
    public void reverse() {
        ListNode current = front;
        ListNode reversed = null;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = reversed;
            reversed = current;
            current = tmp;
        }
        front = reversed;

    }
}














