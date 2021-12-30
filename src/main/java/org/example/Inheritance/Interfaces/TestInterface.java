package org.example.Inheritance.Interfaces;
//Example for final key word
 class Execute
{
    final int a=20;
    void m1()
    {
        //a=39; not valid because a is final variable
        System.out.println(a);
    }
}
class Execute123 //extends Execute
{
    void m1()//not valid bcoz m1 is final method
    {
        System.out.println("m1 is overridden");

    }
}



public class TestInterface {
    public static void main(String[] args) {


    }
}
