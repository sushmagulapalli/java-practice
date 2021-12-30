package org.example.DataStructures;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<String>();
        //Adding elements to array list
        list.add("Rakesh");
        list.add("Rakhi");
        list.add("Raksha");
        list.add("Chiraku");
        list.add("SdetRakhi");

        System.out.println(list.size());// return no.of elements in array list
        for (String s:list) //reading elements from array listt
        {
            System.out.println(s);
        }
    }
}
