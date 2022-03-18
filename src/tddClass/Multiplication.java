package tddClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number1= input.nextInt();
        for(int number=1; number<=12; number++){
            System.out.println(number1+ " x " +number+ " = " +(number1 * number));
        }
    }
}
