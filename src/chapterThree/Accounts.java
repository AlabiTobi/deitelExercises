package chapterThree;

public class Accounts {
   private String name;
    private int balance;
    public Accounts (String name, int balance){
        this.name= name;
        if(balance> 0){
            this.balance = balance;
        }
    }
}

