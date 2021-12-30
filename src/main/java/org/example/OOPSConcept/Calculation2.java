package org.example.OOPSConcept;
//method Returns Some value
public class Calculation2 {
    int a;
    int b;
int sum()
{
    return (a+b);
}
    public static void main(String[] args) {
        Calculation2 cal = new Calculation2();
        cal.a = 100;
        cal.b = 200;
        int r = cal.sum();
        System.out.println(r);
    }
    }
