package org.example.CodingExamples;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="java   programming    language";
        System.out.println("Before removing the white spaces" +str);
        str = str.replaceAll("\\s", "");
        System.out.println("After removing the white spaces" +str);

    }
}
