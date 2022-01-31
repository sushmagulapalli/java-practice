package org.example.OneHundredExamples.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="Sushma";
        String rev="  ";
        int len=str.length();
        for (int i = len-1; i>=0 ; i--)
        {
         rev=rev+str.charAt(i);
        }
        System.out.println("After reveresing String" +rev);
    }
}
