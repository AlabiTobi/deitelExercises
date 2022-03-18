package tddClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(67890);
        assertEquals(67890, tobiAccount.getBalance());
    }
    @Test
    public void depositTwiceTest(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(500);
        tobiAccount.deposit(400);
        assertEquals(500+400, tobiAccount.getBalance());
    }
    @Test
    @DisplayName("Test that negative deposit will not work")
    public void negativeDepositTest(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(1000);
        tobiAccount.deposit(-500);
        assertEquals(-500, tobiAccount.getBalance());
    }
    @Test
    public void withdrawTest() {
        Account tobiAccount = new Account();
        tobiAccount.deposit(1000);
        tobiAccount.withdraw(500);
        assertEquals(500, tobiAccount.getBalance());
    }
    @Test
    public void emptyAccountTest() {
        Account tobiAccount = new Account();
        tobiAccount.deposit(0);
        tobiAccount.withdraw(400);
        assertEquals(0, tobiAccount.getBalance());
    }

    @Test
    public void negativeWithdrawTest(){
        Account tobiAccount = new Account();
        tobiAccount.deposit(1000);
        tobiAccount.withdraw(2000);
        assertEquals(1000,tobiAccount.getBalance());



    }



}
