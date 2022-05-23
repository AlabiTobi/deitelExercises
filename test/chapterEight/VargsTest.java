package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class VargsTest {
Vargs vargs = new Vargs ();
@Test
    void testAdd(){
    BigDecimal money =new BigDecimal("30228789871.20");
    DecimalFormat formatter = new DecimalFormat ();
    formatter.setGroupingUsed (true);
    formatter.setGroupingSize(4);
    System.out.println(formatter.format (money));
    LocalDateTime myGrandMother = LocalDateTime.now ();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern ("E, M-dd-yyyy hh:mm:s a");
    System.out.println (dateTimeFormatter.format (myGrandMother));

}
}