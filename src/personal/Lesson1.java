package personal;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int[] factors = new int[5];
//        for (int i = 0; i < factors.length; i++) {
//            System.out.println ("Enter a factor: ");
//            factors[i]= input.nextInt();

        for (int i = 0; i < factors.length; i++) {
            factors[i] = (3 * i) + 3;
        }

        }
    }
