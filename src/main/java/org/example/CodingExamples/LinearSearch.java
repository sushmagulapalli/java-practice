package org.example.CodingExamples;
// Searching an Element in Array | Linear Search or Sequential Search

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int search_element=40;
        boolean flag= false;
        for (int i = 0; i <a.length ; i++)
        {
         if (search_element==a[i])
         {
             System.out.println("Element Found" +i);
              flag=true;
             break;

         }
        }
    if (flag==false)
    {
        System.out.println("Element Not Found");
    }
    }
}
