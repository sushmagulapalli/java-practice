package org.example.MethodOverloading;

public class NonStaticMethod {
    int a;
    static int b;

    static void m1()//Static
    {
        System.out.println("This m1 is Static Method");
    }
    void m2()// Non Static
    {
        System.out.println("This m2 is not Static method");
    }
    void m3()// Non Static method
    {
        a=10000;
        b=20000;
        System.out.println("This m3 is non Static method");
        m1();
        m2();
    }
//Static Keyword can also access non static stuff through object
    public static void main(String[] args) {
        b=100;
        System.out.println(b);
        m1();
        NonStaticMethod se= new NonStaticMethod();
        se.a=500;
        System.out.println(se.a);
        se.m2();
        se.m3();
}
}

