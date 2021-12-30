package org.example.Inheritance;

class A {
    int a;
    int b;

    public void diplay() {
        System.out.println(a + b);
    }
}

    class B extends A
    {
        int x;
        int y;           //Single Inheritance

        public void show() {
            System.out.println(x + y);
        }
    }

    class C extends B
    {
        int p;
        int q;              //Multi level Inheritance
        public void addition()
        {
            System.out.println(p+q);
        }
    }
        public class Test1
        {
            public static void main(String[] args) {

                A aobj=new A();
                aobj.a=100;
                aobj.b=200;
                aobj.diplay();

                B bobj=new B();
                bobj.x=24;
                bobj.y=34;
                bobj.show();


                bobj.a=150;
                bobj.b=273;
                bobj.diplay();

                C cobj=new C();
                cobj.a=200;
                cobj.b=300;
                cobj.x=30;
                cobj.y=20;
                cobj.p=400;
                cobj.q=30;
                cobj.diplay();
                cobj.show();
                cobj.addition();



        }
    }


