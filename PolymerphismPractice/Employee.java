package PolymerphismPractice;

import accounts.Person;

public abstract class Employee extends Person {

    private  int id;
    public Employee(String firstName, String lasttName, int phoneNumber) throws Exception {
        super(firstName, lasttName, phoneNumber);
        this.id = (int) (Math.random()*8);
    }

    public  abstract  int work(int hours);


}
