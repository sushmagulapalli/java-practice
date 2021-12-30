package org.example.ExceptionHandling;

public class ExceptionsExample {
    public static void main(String[] args) {
        System.out.println("started");
       // Thread.sleep(5000);//Interupted Exception which is checked expection
        int i=100;
        System.out.println(i/0);//Airthmetic Exception which is unchecked Exception
        System.out.println("Stopped");
    }
}
