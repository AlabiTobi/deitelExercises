package personal;

import java.util.Locale;

public class ForLoop {
    public static void main (String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                String carName = "Volve car";
                System.out.println (carName);
                System.out.println ("number found is " + i+carName);
            }
            if (count == 6) {
                break;
            }
        }
            System.out.println ("sum is " + sum);
    }
}