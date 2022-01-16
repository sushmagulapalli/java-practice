package org.example.CodingExamples;

public class ReverseString2 {
    public static void main(String[] args) {

        String str="Java and selenium are programming languages";
        StringBuffer sb1=new StringBuffer(str);
        StringBuffer rev=sb1.reverse();
        {
            System.out.println("After Reversing a String: -->"+"   " +rev);
        }

        // Reverse each word in a string

        String []words=str.split(" ");
        String reverseword="";
        for (String w :words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseword=reverseword+sb.toString()+" ";
        }
        System.out.println("After reversing Each word in string: -->"+ " " +reverseword);
    }

}
