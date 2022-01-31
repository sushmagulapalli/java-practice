package org.example.collections;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(50);
        listOfNumbers.add(10);
        listOfNumbers.add(20);
        listOfNumbers.add(30);
        listOfNumbers.add(10); //duplicate is okay
        listOfNumbers.add(null); //null is okay
        System.out.println(listOfNumbers);
        listOfNumbers.set(2,121); //Inserting an element in to ArrayList
        System.out.println(listOfNumbers);
        listOfNumbers.remove(3);//Removing an element from Array list
        System.out.println(listOfNumbers);
        System.out.println(listOfNumbers.size());

        System.out.println(listOfNumbers.get(2));


    }
}
