package org.example.CodingExamples;
// How To Find Duplicate Elements in Array

import java.util.HashSet;

public class DuplicateValues {
    public static void main(String[] args) {


       /* String arr[] = {"java","c","c" ,"sql", "java","selenium","Database"};
        boolean flag=false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println("FOund Duplicate value"+ " " +arr[i]);
                    flag=true;
                }

            }

        }
        if (flag==false)
        {
            System.out.println("Dulpicate Element Not Found");
        }*/

        // Using HashSet
        String arr[] = {"java","c","c" ,"sql", "java","selenium","Database"};

        HashSet <String>langs = new HashSet();


    for( String str : arr ) {
        boolean flag = langs.add(str);
        if (!flag) {
            System.out.println("Duplicate elements: " + str);
        }
    }


       /* System.out.println( langs.add("java"));
        System.out.println( langs.add("Selenium"));
        System.out.println(langs.add("java"));
        System.out.println(langs.add("Database"));
        System.out.println(langs.add("c"));
        System.out.println(langs.add("c"));
        System.out.println(langs.add("sql"));*/



    }

}
