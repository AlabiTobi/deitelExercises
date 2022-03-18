package tddClass;

import java.util.Scanner;

public class Triangle {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        for (int row = 1; row <= 5; row++) {
            //Increasing Space and Triangle Star

            for (int colomn = 1; colomn <= row; colomn++) {
                System.out.print("* ");
            }
            for (int colomn = row; colomn <= 5; colomn++) {
                System.out.print("  ");
            }
            for (int colomn = row; colomn <= 5; colomn++) {
                System.out.print("* ");
            }
            for (int colomn = 1; colomn <= row; colomn++) {
                System.out.print("  ");
            }
            for (int colomn = 1; colomn <= row; colomn++) {
                System.out.print("  ");
            }
            for (int colomn = row; colomn <= 5; colomn++) {
                System.out.print("* ");
            }
            for (int colomn = row; colomn <= 5; colomn++) {
                System.out.print("  ");
            }
            for (int colomn = 1; colomn <= row; colomn++) {
                System.out.print("* ");
            }
            System.out.println();
    }

    }


    }









