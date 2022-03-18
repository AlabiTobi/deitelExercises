package personal;

import java.util.Arrays;

public class AnotherArray {
    public static void main (String[] args) {
        int[] evenNumbers = new int[10];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = (2 * i) + 2;
        }
//        System.out.println (Arrays.toString (evenNumbers));
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println (evenNumbers[i]);
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = (2 * i) + 1;
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println (evenNumbers[i]);
        }
    }
}
