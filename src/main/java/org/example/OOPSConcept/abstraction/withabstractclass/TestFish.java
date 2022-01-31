package org.example.OOPSConcept.abstraction.withabstractclass;

public class TestFish {

    public static void main(String[] args) {
        Animal animal = new Fish();
//        Fish animal = new Fish();

        animal.eat();
        animal.move();
        animal.label();
    }
}
