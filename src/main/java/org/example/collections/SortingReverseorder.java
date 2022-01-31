package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingReverseorder {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1234);
        list1.add(5674);
        list1.add(3245);
        list1.add(2345);
        list1.add(5679);
        list1.add(4567);
        System.out.println("Before sorting " +list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("After Sorting" +list1);








    }
}
