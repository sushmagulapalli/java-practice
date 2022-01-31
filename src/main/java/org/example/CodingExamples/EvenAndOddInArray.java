package org.example.CodingExamples;

public class EvenAndOddInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};

       /* System.out.println("Print all even numbers");
        for (int i = 0; i <a.length ; i++)
        {
          if(a[i]%2==0)
              System.out.println(a[i]);
        }*/

        //Using Enhanced ForLoop
        for (int value:a)
        {
            if (value%2==0){
                System.out.println("even number"  +value);
                }else
            {
                System.out.println("oddnumber" +value);
            }
        }


       /* System.out.println("Print all odd numbers");
        for (int i = 0; i <a.length ; i++)
        {
            if(a[i]%2!=0)
            System.out.println(a[i]);

        }*/
    }
}
