package org.example.Inheritance;
///Method Over riding using inheritance

class Bank
{
    int getRateOfInterest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 10;
    }
}
class ICICI extends Bank
{
    int getRateOfInterest()
    {
        return 20;
    }
}
class AXIS extends Bank
{
    int getRateOfInterest()
    {
        return 30;
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        SBI sbiobj=new SBI();
        System.out.println(sbiobj.getRateOfInterest());// 10

        ICICI iciciobj=new ICICI();
        System.out.println(iciciobj.getRateOfInterest()); //20

        AXIS axisobj=new AXIS();
        System.out.println(axisobj.getRateOfInterest()); //30
}
}
