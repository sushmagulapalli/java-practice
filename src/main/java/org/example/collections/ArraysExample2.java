package org.example.collections;

import java.util.ArrayList;

public class ArraysExample2 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("Three");
        list.add("Four");
        System.out.println(list);
        list.add("five");// here we are inserting some elements
        list.add("Six");
        list.add("Seven");
        System.out.println(list);
        list.remove(3);// removing some elements
        System.out.println(list.size());
        list.add(0,"Zero");
        list.add(7,"eight");//adding the element at index
        System.out.println(list);








    }
}
