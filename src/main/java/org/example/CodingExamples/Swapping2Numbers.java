package org.example.CodingExamples;

public class Swapping2Numbers {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Numbers Before Swapping..." +a+ "  " +b);

       /* //Using 3rd variable
        int t=a;
        a=b;
        b=t;*/

        //Without using 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping..." +a+ "   " +b);


    }
}
