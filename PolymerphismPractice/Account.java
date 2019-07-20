package PolymerphismPractice;

import accounts.Person;

public class Account {
    private int number;
    private  int balance;
    private Person owner;

    public Account(int number, int balance, Person owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }
}
