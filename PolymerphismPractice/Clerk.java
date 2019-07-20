package PolymerphismPractice;

public class Clerk extends  Employee {

    private int wage;

    public Clerk(String firstName, String lasttName, int phoneNumber) throws Exception {
        super(firstName, lasttName, phoneNumber);
        this.wage = 20;
    }

    @Override
    public int work(int hours) {
        return  hours * wage ;
    }
}
