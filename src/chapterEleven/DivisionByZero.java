package chapterEleven;

import java.util.Scanner;

public class DivisionByZero {
    public static void main (String[] args) {
        int numerator= input("Enter numerator");
        int denominator = input("Enter denominator");
        int approximateQuotient = numerator / denominator;
        display(approximateQuotient+"");
    }
    private static int input(String prompt){
        System.out.println (prompt);
        Scanner keyboardInput = new Scanner (System.in);
        return keyboardInput.nextInt ();
    }
    private static void display(String prompt){

        System.out.println (prompt);
    }
}
