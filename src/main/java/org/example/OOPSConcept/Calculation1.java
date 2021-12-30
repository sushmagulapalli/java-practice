package org.example.OOPSConcept;
// A method Take Parameters
public class Calculation1 {
    int a;
    int b;
    void sum(int x, int y)
    {
        a=x;
        b=y;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calculation1 cal=new Calculation1();
        cal.sum(400,200);
    }
}
