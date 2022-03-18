package personal;

import java.util.Scanner;

public class MultiDimensionalArrayIntPractice {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] numbers = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf ("Enter number for row %d column %d: %n",(row+1),(column+1));
                numbers[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf("%d ",numbers[row][column]);
            }
            System.out.println ();
        }
    }
}