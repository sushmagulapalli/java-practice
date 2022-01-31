package org.example.collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
       //doesnt allow dupliate elemnts

        /*set.add("Java");
        set.add("Programming");
        set.add("Java");
        set.add("Language");
        set.add("Used by many users");
        set.add("Java");
        System.out.println(set);
*/
        //only one null element can be stored in hashset
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("null");
        set.add("null");
        set.add("null");
        System.out.println(set);




    }
}
