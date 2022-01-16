package org.example.CodingExamples;

import java.util.Arrays;
import java.util.Collections;

// Sort Elements in Array Using Built-in Methods
public class SortingBuiltInMethod {
    public static void main(String[] args) {
// using parallel sort
   /*
     int a[]={13,35,67,68,97,45,3,5,7,9};
        System.out.println("Arrays Before Sorting" + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Arrays after Sorting" +Arrays.toString(a));
*/
// using sort// Ascending order
        int a[] ={13,35,67,68,97,45,3,5,7,9};
        System.out.println("Arrays Before Sorting" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arrays after Sorting" +Arrays.toString(a));



        /*/// Descending order Bubble Sort
        Integer a[] ={13,35,67,68,97,45,3,5,7,9};
        System.out.println("Arrays Before Sorting" + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Arrays after Sorting" +Arrays.toString(a));
*/

    }
}
