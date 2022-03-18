package tddClass;

public class Account {
    private final String ACCOUNT_NUMBER;
    private String accountName;
    private int balance;
    private final String pin;

    public Account (String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = firstName + " " + lastName;
        this.pin = (pin);
    }

    public void deposit (int amount) {
        balance = amount + balance;

    }
    public String getAccountName(){
        return accountName;
    }
    public int getAccountBalance (String pin) {
        if (pin.equals (this.pin)) return balance;
        return 0;
    }
    public void withdraw (int amount) {
        if (pin.equals (this.pin))
            balance -= amount;
        }
    public String getAccountNumber () {
        return ACCOUNT_NUMBER;
    }

}

   



