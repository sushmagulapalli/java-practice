package org.example.DataStructures;

import java.util.ArrayList;

public class ArrayListExamp2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        //Adding elemnts to array list
        al.add("Welcome");
        al.add(10);
        al.add(10.246);
        al.add('C');
        System.out.println("Number of elements in array list are:" +al.size());//no of elements present in al

    }
}
