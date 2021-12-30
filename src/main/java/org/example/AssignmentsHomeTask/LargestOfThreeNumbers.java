package org.example.AssignmentsHomeTask;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;

        if ((a > b) && (a > c)) {
            System.out.println("a is Largest");
        } else if ((b > a) && (b > c)) {
            System.out.println("B is Largest");
        } else {
            System.out.println("C is Largest");
        }
    }
}
