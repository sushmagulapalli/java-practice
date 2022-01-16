package org.example.AssignmentsHomeTask;

public class EvenandOdd {
    public static void main(String[] args) {
        int num=123456789;
        int evencount=0;
        int oddcount=0;
        while (num>0)
        {
          int  reminder = num%10;
           if (reminder%2==0)
           {
               evencount++;
           }
           else
           {
               oddcount++;
           }
            num =num/10;

        }
        System.out.println("even numbers" +evencount);
        System.out.println("odd numberrs" +oddcount);
    }
}
