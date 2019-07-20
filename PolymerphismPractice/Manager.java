package PolymerphismPractice;

public class Manager extends Employee {

    private int salary;

    public Manager(String firstName, String lasttName, int phoneNumber) throws Exception {
        super(firstName, lasttName, phoneNumber);
        this.salary = 2000;
    }

    @Override
    public int work(int wages) {
        return salary;
    }
}
