package org.example.CodingExamples;

import java.util.Scanner;

public class ReverseANumber2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);// input from the user

            System.out.println("Enter a Number");

            int num = sc.nextInt();
            //Using String Buffer
            StringBuffer sb = new StringBuffer(String.valueOf(num));
            StringBuffer rev = sb.reverse();

            System.out.println("After reverse number" +rev);
        }
}
