package org.example.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args)
    {
        //linked hashset follows the order of the implementation
        LinkedHashSet<String> set = new LinkedHashSet<>();

        //Adding elements to HashSet

        set.add("BANGALORE");

        set.add("DELHI");

        set.add("CHENNAI");

        set.add("MUMBAI");

        set.add("AHMEDABAD");
        System.out.println(set);
    }
}
