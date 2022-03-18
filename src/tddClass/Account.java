package tddClass;

public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount < 0) balance = 0;
        balance = amount + balance;

    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdrew){
        if (balance > withdrew){balance = balance - withdrew;}
    }
}

   



