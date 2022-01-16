package org.example.CodingExamples;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();

        System.out.println("Enter Second nUmber");
        int b = sc.nextInt();

        System.out.println("Enter Third number");
        int c = sc.nextInt();*/

        int a=20;
        int b=30;
        int c=40;

        if (a > b && a > c) {
            System.out.println("a is Largest");
        } else if (b > a && b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
