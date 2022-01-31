package org.example.collections;

import java.util.ArrayList;
//Insert more than one element at a particular position of an ArrayList?
public class InsertingMoreElementsArray {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        System.out.println(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(21);
        list2.add(22);
        list2.add(23);
        list2.add(24);
        System.out.println(list2);

   list1.addAll(2,list2);
        System.out.println(list1);










    }


}
