package org.example.loops;
// Print two even numbers
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i += 2;//(i=i+2)
        } while (i <= 10);
        System.out.println("Program Exited");

    }
}
