package Bank;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1,"Manager1", 200);
        Bank rbc = new Bank(manager);
        Employee mac = new Employee(1, "Mac" ,10);

        rbc.addEmployee(mac);

        Account checking = new Account(1,0, mac);
        rbc.addAccount(checking);
    }
}
