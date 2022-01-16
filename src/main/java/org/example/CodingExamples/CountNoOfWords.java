package org.example.CodingExamples;

public class CountNoOfWords {
    public static void main(String[] args) {
        String str = "Welcome to the Java tutorials";
        String strArray[]=str.split( " ");
        System.out.println("The number of words in a string is " + strArray.length);
        System.out.println(str.length());
    }

}
