package org.example.CodingExamples;
//5! = 1*2*3*4*5
public class FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        long factorial=1;
        for (int i = 1; i <=num ; i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of a number" +factorial);
    }
}
