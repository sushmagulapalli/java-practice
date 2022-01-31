package org.example.OneHundredExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args)
    {
        //Constructing an ArrayList

        ArrayList<String> list = new ArrayList<String>();

        list.add("Gold");

        list.add("Iron");

        list.add("Copper");

        list.add("Silver");

        list.add("Nickel");

        list.add("Cobalt");

        list.add("Zinc");

        //Printing list before reverse

        System.out.println("ArrayList Before Reverse :");

        System.out.println(list);

        //Reversing the list using Collections.reverse() method

        Collections.reverse(list);

        //Printing list after reverse

        System.out.println("ArrayList After Reverse :");

        System.out.println(list);
    }
}
