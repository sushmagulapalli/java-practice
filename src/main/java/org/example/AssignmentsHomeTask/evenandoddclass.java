package org.example.AssignmentsHomeTask;

public class evenandoddclass {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,};
        for (int value:a)
        {
           if (value%2==0)
           {
               System.out.println("even number-->" +value);
        }else
           {
               System.out.println("odd number-->" +value);
           }

        }
    }
}
