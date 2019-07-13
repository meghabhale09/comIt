package Bank;
import  java.util.*;

import java.util.List;
import java.util.function.*;

public class Main {
    private Manager manager;
    private List<Employee> employees;
    private List<Account> accounts;

    public Main(Manager manager) {
        this.manager = manager;
        this.employees = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void fireeEmployee(int employeeId){
        employees.removeIf(employee -> employee.getId()==employeeId);
       /* for(Employee e : employees){

            if(e.getId()==employeeId){
               employees.remove(e);
            }
        }*/
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void remvoveAccount(int accountNumber){
        accounts.stream().filter(a->a.getNumber()==accountNumber)
                .findFirst().ifPresent(a->a.getNumber());
    }
}
