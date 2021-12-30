package org.example.Inheritance;
//Over Riding Example 2
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is Running");
    }
}



public class OverRiding2 {
    public static void main(String[] args) {
       // Vehicle vehicleobj=new Vehicle();
        //vehicleobj.run();

      //  Bike bikeobj=new Bike();
        //bikeobj.run();

        Bike b=new Bike();
        b.run();
}
}
