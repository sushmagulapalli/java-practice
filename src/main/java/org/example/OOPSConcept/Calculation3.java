package org.example.OOPSConcept;
// Method may not return some value
public class Calculation3 {
    int a;
    int b;

    void sum() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.a = 100;
        cal.b = 200;
        cal.sum();

    }
}
