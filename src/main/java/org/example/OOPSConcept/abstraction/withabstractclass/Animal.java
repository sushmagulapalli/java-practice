package org.example.OOPSConcept.abstraction.withabstractclass;

public abstract class Animal {

    //abstract methods
    abstract void move();

    abstract void eat();

    //concrete method
    void label() {
        System.out.println("Data about animal");
    }

}
