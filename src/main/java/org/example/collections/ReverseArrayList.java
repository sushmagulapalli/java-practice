package org.example.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Sushma");
        list.add("is");
        list.add("a");
        list.add("good");
        list.add("girl");
        System.out.println("List before reverse"+ "" +list);

        Collections.reverse(list);
        System.out.println("List after Reverse"+"" +list);






    }
}
