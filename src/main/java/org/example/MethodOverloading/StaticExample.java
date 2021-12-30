package org.example.MethodOverloading;

public class StaticExample {
    int a;
    static int b;

    static void m1()
    {
        System.out.println("This m1 is Static Method");
    }
    void m2()
    {
        System.out.println("This m2 is not Static method");
    }

    public static void main(String[] args) {
// static method can access only static stuff
        b=200;
        System.out.println(b);
        m1();

    }
}
