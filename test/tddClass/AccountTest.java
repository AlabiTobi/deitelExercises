package tddClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    @BeforeEach
    public void startWith(){
        Account account = new Account ("01543505", "Alabi", "Tobi", "1093");
    }

@Test
public void accountCreatedTest(){
    Account tobiAccount = new Account ("01543505", "Alabi", "Tobi", "1093");
    assertNotNull(tobiAccount);
}

@Test
public void accountCanBeCreatedWithAllDetailsTest(){
    Account tobiAccount = new Account ("01543505", "Alabi", "Tobi", "1093");
    assertEquals ("01543505", tobiAccount.getAccountNumber ());
}

@Test
    public void depositTest(){
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(67890);
        assertEquals(67890, tobiAccount.getAccountBalance ("1093"));
    }

@Test
    public void depositTwiceTest(){
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(500);
        tobiAccount.deposit(400);
        assertEquals(500+400, tobiAccount.getAccountBalance ("1093"));
    }

@Test

    public void negativeDepositTest(){
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(1000);
        tobiAccount.deposit(-500);
        assertEquals(-500, tobiAccount.getAccountBalance ("1093"));
    }

@Test
    public void withdrawTest() {
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(1000);
        tobiAccount.withdraw(500);
        assertEquals(500, tobiAccount.getAccountBalance ("1093"));
    }

@Test
    public void emptyAccountTest() {
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(0);
        tobiAccount.withdraw(400);
        assertEquals(0, tobiAccount.getAccountBalance ("1093"));
    }

@Test
    public void negativeWithdrawTest(){
        Account tobiAccount = new Account("01543505", "Alabi", "Tobi", "1093");
        tobiAccount.deposit(1000);
        tobiAccount.withdraw(2000);
        assertEquals(1000,tobiAccount.getAccountBalance ("1093"));

    }

}
