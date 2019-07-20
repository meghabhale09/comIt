package PolymerphismPractice;

public class AccountMain {
    Employee clerk1;
    Employee manager;
    {
        try {
            clerk1 = new Clerk("john","kk",782345123);
            manager = new Manager("Micheal","ss",782345123);
            Account noMoney = new Account(100, 1000, clerk1);
            Account deposit = new Account(200,400,manager);

            manager.work(10);
            clerk1.work(20);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
