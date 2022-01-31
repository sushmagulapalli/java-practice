package org.example.OneHundredExamples.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String Name");

        String originalName = sc.next();
        String rev = "";

        int len = originalName.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + originalName.charAt(i);

        }

        if (originalName.equals(rev)) {
            System.out.println(originalName+"  Entered String is palindrome" );
        } else {
            System.out.println(originalName+" Entered String is not palindrome");
        }


    }
}

