package org.example.CodingExamples;
// How To Find Maximum & Minimum Values in Array

public class MaximumAndMinimumvalues {
    public static void main(String[] args) {

      //Maximum of Numbers
        int a[]={10,20,30,40,50};
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Maximum of number" +max );



        //Minimum of numbers
        int b[]={30,50,60,80,5,90};
        int min=b[0];
        for (int j = 0; j <b.length ; j++) {
            if (b[j]<min)
            {
                min=b[j];
            }

        }
        System.out.println("Minimum of numbers" +min);
    }

    }

