package arrays;

import java.util.ArrayList;

public class ArrayInsertAtIndex {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // method to insert an element at a specific index
        insertAtIndex(list, 2, 25); // Insert 25 at index
    }

    private static void insertAtIndex(ArrayList<Integer> list, int i, int i1) {
        list.add(i, i1);
        System.out.println(list);
    }
}
