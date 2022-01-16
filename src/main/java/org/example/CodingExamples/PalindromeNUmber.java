package org.example.CodingExamples;

import java.util.Scanner;

public class PalindromeNUmber {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int rev=0;
        int orginalnum=num;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(orginalnum==rev)
        {
            System.out.println("Entered number is palindrome" +rev);
        }
        else {
            System.out.println("Entered number is not palindrome" +rev);
        }
    }
}
