package org.example.MethodOverloading;

public class MethoadOverloading {
    int a;
    int b;

    void sum()
    {
        a=10;
        b=20;
        System.out.println(a+b);
    }
    void sum(int x, int y)
    {
       int a=x;
       int b=y;
        System.out.println(a+b);
    }

    void sum(int x, int y,int z)
    {
        System.out.println(x+y+z);
    }


    void sum(int x,double y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        MethoadOverloading mo=new MethoadOverloading();
        mo.sum();
        mo.sum(100,200);
        mo.sum(150,250,350);
        mo.sum(120,13.456);
    }

}
