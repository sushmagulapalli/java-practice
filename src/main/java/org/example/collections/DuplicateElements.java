package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Sushma");
        list.add("Rakesh");
        list.add("Sushma");
        list.add("Ravi");
        list.add("madhavi");
        list.add("Sushma");
        list.add("Ravi");

        System.out.println("Before Duplicating" +list);
        HashSet<String> set=new HashSet<>(list); //Using Hashset
        ArrayList<String> list1=new ArrayList<>(set);//Constructing listWithoutDuplicateElements using set
        System.out.println("After removing duplicate" +list1);







    }
}
