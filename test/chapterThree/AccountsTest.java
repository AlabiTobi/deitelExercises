package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {
    @Test
    public void accounts(){
        Accounts account1 = new Accounts ("Wale Adenuga", 500);
        Accounts account2 = new Accounts ("Sola Sobowale", 4000);
        assertNotEquals (account1,account2);

    }


}