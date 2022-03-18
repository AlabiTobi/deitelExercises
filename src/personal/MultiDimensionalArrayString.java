package personal;

import java.util.Scanner;

public class MultiDimensionalArrayString {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String[][] names = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf("Enter name for row %s column %s: %n",(row+1),(column+1));
                names[row][column] = input.nextLine ();
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.printf ("%10s",names[row][column]);
            }
            System.out.println ();

        }
    }
}
