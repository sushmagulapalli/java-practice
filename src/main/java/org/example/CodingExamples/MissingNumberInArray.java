package org.example.CodingExamples;
// Find Missing Number in an Array

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Array should not have any duplicates
        //Array no need to be sorted in order
        //Values should be in range
        int a[] = {1,2,3,4,6,7,8,9,10};
        int sum1=0;
        for (int i = 0; i <a.length ; i++)
        {
            sum1 = sum1 + a[i];
        }
            System.out.println("Sum of numbers" +sum1);


        int sum2=0;
        for (int i = 1; i <=10 ; i++)
        {
           sum2=sum2+i;
        }
        System.out.println("Sum of range of numbers "  +sum2);
        //System.out.println(sum1-sum2 +"  " +"Missig Number");
            int total=sum1-sum2;
        System.out.println("number missing" +total);
        }



    }

