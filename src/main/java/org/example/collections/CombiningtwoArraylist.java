package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CombiningtwoArraylist {


        public static void main(String[] args){
            ArrayList<String> list1=new ArrayList<>();
            list1.add("one");
            list1.add("two");
            list1.add("three");
            list1.add("four");

            System.out.println(list1);

       ArrayList<String> list2=new ArrayList<>();
            list2.add("werty");
            list2.add("Qwerty");
            list2.add("Awerty");
            list2.add("Zwerty");
            System.out.println(list2);

            list1.addAll(list2);
            System.out.println(list1);

        }


    }

