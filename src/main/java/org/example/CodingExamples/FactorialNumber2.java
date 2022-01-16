package org.example.CodingExamples;
// 5! = 5*4*3*2*1
public class FactorialNumber2 {
    public static void main(String[] args) {
        int num=10;
        long factorial=1;
        for (int i =num; i>=1 ; i--)
        {
          factorial=factorial*i;

        }
        System.out.println("Factorial Number"+ "  "  +factorial);

    }

}
