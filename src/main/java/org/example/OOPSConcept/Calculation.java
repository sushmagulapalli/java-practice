package org.example.OOPSConcept;

public class Calculation {
    int a;
    int b;
    // Method may Take Parameters
    void sum()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
    Calculation cal=new Calculation();
        cal.a=100;
        cal.b=200;
        cal.sum();
    }
}
