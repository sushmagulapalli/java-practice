package org.example.AssignmentsHomeTask;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0;
        int originalnum= num;

        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if (originalnum==rev) {
            System.out.println("palindrome" + rev);
        }
        else
        {
            System.out.println("not palindrome" +rev);
        }
    }
}
