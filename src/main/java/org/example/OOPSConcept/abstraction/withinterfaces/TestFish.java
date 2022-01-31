package org.example.OOPSConcept.abstraction.withinterfaces;

public class TestFish {
    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.move();
        animal.eat();
    }
}
