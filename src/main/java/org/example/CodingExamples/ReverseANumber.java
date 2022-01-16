package org.example.CodingExamples;


import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);// input from the user

        System.out.println("Enter a Number");

        int num=sc.nextInt();
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }

        System.out.println("reverse a number is"  +rev);
    }
}
