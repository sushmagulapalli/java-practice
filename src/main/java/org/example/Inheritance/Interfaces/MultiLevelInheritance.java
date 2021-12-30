package org.example.Inheritance.Interfaces;
interface A
{
    int a=10;
    void display();
}
interface B
{
    int b=20;
    void show();
}

public class MultiLevelInheritance implements A,B
{

    public void display() {
        System.out.println(a);

    }

        public void show()
        {
            System.out.println(b);
        }


    public static void main(String[] args) {
        MultiLevelInheritance mi=new MultiLevelInheritance();
        mi.display();
        mi.show();

    }
}
