package org.example.Accessmodifiers;


class A
{
     int i=10;
     void m1()
    {
        System.out.println(i);
    }
}

public class Accessmodifiersexample {
    public static void main(String[] args) {
        A obj=new A();
        obj.i=10;// access because private is not mentioned
        obj.m1();// Cannot access because private is included
    }
}
