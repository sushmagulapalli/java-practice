package org.example.AssignmentsHomeTask;

import java.util.HashSet;

public class Duplicatestrings {
    public static void main(String[] args) {
        String arr[]={"java","c","java","sql","java"};
        HashSet<String> langs=new HashSet<>();
        for (String str : arr)
        {
            boolean flag=langs.add(str);
            if (!flag)
            {
                System.out.println("Duplicate values--->" +str);
            }

        }
    }
}
