package org.example.CodingExamples;
// Find Sum of Elements in Array
public class SumElementsInArray {
    public static void main(String[] args) {

        int  a[] = {4,5,6,7,8,8,9,10};
      int sum=0;
     /* for (int i=0;i<=a.length-1;i++)
      {
          sum=sum+a[i];
      }*/


        // Using Enhanced ForLoop
        for(int value:a)
        {
            sum=sum+value;
        }
        System.out.println("Sum of elements in array" +sum);
    }
}
