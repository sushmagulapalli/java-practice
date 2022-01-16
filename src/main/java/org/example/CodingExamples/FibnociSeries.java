package org.example.CodingExamples;
// 0 1 1 2 3 5 8 13 21
public class FibnociSeries {
    public static void main(String[] args) {
        int N1=0 ,N2=1 ,Sum=0;
        System.out.print(N1+ " " +N2);

        for (int i = 2; i < 10; i++) {
            Sum=N1+N2;
            System.out.print( "  "+Sum);
            N1=N2;
            N2=Sum;



        }

    }
}


// 0 1 1 2 3