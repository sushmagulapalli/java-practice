package org.example.Inheritance.Interfaces;
interface Testinter
{
    int a=10;  //bydefault variable is static and final
    void display(); //abstract method
}
public class interfaces1 implements Testinter
{
  public void display()
    {
        System.out.println(a);
    }
   public static void main(String[] args) {
      interfaces1 ie=new interfaces1();
      ie.display();
    }
}
