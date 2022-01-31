package org.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Sushma");
        list.add("rakesh");
        list.add("Abhinav");
        list.add("chaithanya");
        list.add("Fahi");

        System.out.println("Before Sorting the elements" +list);
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);

        System.out.println("After sorting the elements" +list);










    }
}
