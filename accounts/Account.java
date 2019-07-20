package accounts;

import java.security.PublicKey;

public class Account {
    private long accountNumber;
    private double balance;
    private Person owner;

    public Account(long accountNumber, double balance, Person owner) {
        this.accountNumber = accountNumber;
        chkBalance(balance);
        this.owner = owner;
    }

    public Account() {
        this.accountNumber = 0;
        chkBalance(0);
        this.owner = null;
    }

    public void chkBalance(double bal){
        if(bal > 0.0) this.balance = bal;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void transaction(int amount, Transaction type){
        if(type==Transaction.WITHDRAW){
            withdraw(amount);
        }else{
            deposit(amount);
        }
    }

    private void withdraw(int amount) {
    }

    private void deposit(int amount) {
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }


}

