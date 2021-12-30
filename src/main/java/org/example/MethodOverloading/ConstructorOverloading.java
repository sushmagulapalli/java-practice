package org.example.MethodOverloading;

public class ConstructorOverloading {
    int a=0;
    int b=0;
    double c=0;
    ConstructorOverloading() //First method
    {
        a=10;
        b=20;
        c=25.67;
    }
    ConstructorOverloading(int x, int y) //First method
    {
        a=x;
        b=y;

    }
    ConstructorOverloading(int x, double y) //First method
    {
        a=x;
        c=y;

    }
    ConstructorOverloading(int x, int y,int z) //First method
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {


       // ConstructorOverloading co = new ConstructorOverloading();
       // ConstructorOverloading co = new ConstructorOverloading(100,200);
       // ConstructorOverloading co = new ConstructorOverloading(200,20.560);
        ConstructorOverloading co = new ConstructorOverloading(300,204,500);
        co.display();
    }

}
