package chapterThree;

import java.util.Random;

public class AlphabetAndNumbers {
    public static void main (String[] args) {

            String upperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
            String figure = "0123456789";
            String combine = upperLetter + lowerLetter+ figure;
            int length = 12;
            Random all = new Random ();
            char[] password = new char[12];
            for (int i = 0; i < length; i++) {
                password[i] = combine.charAt (all.nextInt (combine.length ()));
            }

        System.out.println ("password is: " + new String (password));
    }
}
