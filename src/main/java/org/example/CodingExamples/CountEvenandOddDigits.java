package org.example.CodingExamples;

public class CountEvenandOddDigits {
    //Count Number Of EVEN & ODD Digits in A Number
    public static void main(String[] args) {
        int num=123456789;
        int even_count=0;
        int odd_count=0;

        while (num>0)
        {
           int reminder= num%10;
           if(reminder%2==0)
           {
               even_count++;
           }
           else
           {
               odd_count++;
           }
           num=num/10;
        }
        System.out.println("Even count numbers" +even_count);
        System.out.println("Odd count numbers" +odd_count);
    }
}
