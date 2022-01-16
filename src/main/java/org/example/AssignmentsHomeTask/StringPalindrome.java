package org.example.AssignmentsHomeTask;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String Originalname=sc.next();
        String rev="";
        int len=Originalname.length();
        for (int i = len-1; i >=0 ; i--) {
            rev=rev+Originalname.charAt(i);

        }
        if (Originalname.equals(rev))
        {
            System.out.println("palindrome-->" +rev);

        }else {
            System.out.println("not palindrome--->" +rev);
        }

    }
}
