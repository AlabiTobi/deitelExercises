package personal;

import java.util.Scanner;

public class Array {
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);
//        int[] numbers = new int[8];
        int sum = 0;
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println ("Enter number");
            numbers[i] = input.nextInt ();
        }

        for (int i = 0; i < numbers.length; i++) {
           sum = sum + numbers[i];
        }
        double average = sum * 1.0/numbers.length;
        System.out.println (sum);
        System.out.println (average);
    }

}
