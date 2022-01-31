package org.example.OOPSConcept.encapsulation;

public class TestAccount {

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getBalance());
        System.out.println(account.getNumber());

        account.setBalance(30000);
        System.out.println(account.getBalance());
    }
}
