package org.example.CodingExamples;

import java.util.Arrays;

// Searching an Element in Array | Binary Search
public class BinarySearch {

    public static void main(String[] args) {
        //Approach 1
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
       /* boolean flag = false;
        int key = 6;
        int lower = 0;
        int higher = a.length - 1;
        while (lower < higher) {
            int midvalue = (lower + higher) / 2;
            if (a[midvalue] == key) {
                System.out.println("Element found");
                flag = true;
                break;
            }
            if (a[midvalue] < key) {
                lower = midvalue + 1;
            }
            if (a[midvalue] > key) {
                higher = midvalue - 1;
            }
        }
        if (flag==false)
        {
            System.out.println("Element Not found");
        }*/
        //Second Approach
        System.out.println(Arrays.binarySearch(a, 8));




    }
}
