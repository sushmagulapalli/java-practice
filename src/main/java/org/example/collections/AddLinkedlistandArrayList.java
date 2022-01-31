package org.example.collections;

import java.util.ArrayList;

public class AddLinkedlistandArrayList {
    public static void main(String[] args) {
        ArrayList<String> linkedlist=new ArrayList<>();
        linkedlist.add("Sushma");
        linkedlist.add("Rakesh");
        linkedlist.add("ravi");
        linkedlist.add("Madhu");
        linkedlist.add("Anitha");
        System.out.println(linkedlist);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("pandu");
        arrayList.add("nani");
        System.out.println(arrayList);

        linkedlist.addAll(arrayList);
        System.out.println(linkedlist);
    }
}
