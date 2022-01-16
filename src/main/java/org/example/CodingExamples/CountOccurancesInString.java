package org.example.CodingExamples;

public class CountOccurancesInString {
    public static void main(String[] args) {
        String s="java is a programming language";
        int totalcount=s.length();// total count
        int totalcount_afterremovinga=s.replace("a","").length();//after removing a count
        int count=totalcount-totalcount_afterremovinga;
        System.out.println("Total number of a"+ " " +count);
    }
}
