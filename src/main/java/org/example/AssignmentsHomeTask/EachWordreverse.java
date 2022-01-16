package org.example.AssignmentsHomeTask;

public class EachWordreverse {
    public static void main(String[] args) {
        String str="java is a language";
        String []words=str.split(" ");
        String reverseword="";
        for (String w: words)
        {
            StringBuilder sb=new StringBuilder(w);
            reverseword=reverseword+sb.reverse()+" ";

        }
        System.out.println("Reverse each string in  "+ " " +reverseword);

    }
}
