package org.example.OOPSConcept.encapsulation;

//Java Bean - POJO(Plain Old Java Object)
public class Account {

    //data members - class level variables
    private int balance;
    private int number;

    //getter for field - `balance`
    public int getBalance() {
        return this.balance;
    }

    //getter for field - `number`
    public int getNumber() {
        this.number = 123445;
        return this.number;
    }

    //setter for field - `balance`
    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }


}
