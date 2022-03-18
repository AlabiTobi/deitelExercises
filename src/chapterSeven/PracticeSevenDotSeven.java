package chapterSeven;

import java.security.SecureRandom;

public class PracticeSevenDotSeven {
    public static void main (String[] args) {
        SecureRandom randomNumber = new SecureRandom ();
        int[] frequency = new int[7];
        for (int roll = 1; roll <= 60_000_000; roll++) {
            ++frequency[1 + randomNumber.nextInt (6)];
        }
        System.out.print ("Face" + " " + "Frequency\n");
        for (int face = 1; face < frequency.length; face++) {
            System.out.println (face + "    " +frequency[face]);

        }
    }
}

