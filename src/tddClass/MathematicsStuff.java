package tddClass;

import java.util.Random;
import java.util.Scanner;

public class MathematicsStuff {
    static int correctAnswerCount = 0;
    static int wrongAnswerCount = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int counter = 1;

        while(counter <=10){
            int operator = random.nextInt(1,10);
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);
            switch (operator) {
                case 1 -> {

                    System.out.println(firstNumber + " * " + secondNumber + " =");
                    administerStuff(input.nextInt(),firstNumber,secondNumber,"*");
                }
                case 2 -> {
                    System.out.println(firstNumber + " / " + secondNumber + " =");
                    administerStuff(input.nextInt(),firstNumber,secondNumber,"/");
                }

                case 3 -> {
                    System.out.println(firstNumber + " + " + secondNumber + " =");
                    administerStuff(input.nextInt(),firstNumber,secondNumber,"+");
                }

                case 4 -> {
                    System.out.println(firstNumber + " - " + secondNumber + " =");
                    administerStuff(input.nextInt(),firstNumber,secondNumber,"-");
                }

                case 5 -> {
                    System.out.println(firstNumber + " % " + secondNumber + " =");
                    administerStuff(input.nextInt(),firstNumber,secondNumber,"%");
                }

            }
            counter++;
        }
        System.out.println ("Number of Correct Answers is: "+ correctAnswerCount);
        System.out.println("Number of Wrong Answers is: "+ wrongAnswerCount);
        System.out.println("Adjusted Score is: "+ (correctAnswerCount-wrongAnswerCount));

    }
    public static void administerStuff(int userInput, int firstNumber, int secondNumber, String operator){
        int correctAnswer = 0;
        if (operator =="+"){
            correctAnswer = firstNumber + secondNumber;
        }
        else if (operator == "-"){
            correctAnswer = firstNumber - secondNumber;
        }
        else if (operator == "*"){
            correctAnswer = firstNumber * secondNumber;
        }
        else if (operator == "/"){
            correctAnswer = firstNumber / secondNumber;
        }
        else if (operator == "%"){
            correctAnswer = firstNumber % secondNumber;
        }

        if (userInput == correctAnswer) correctAnswerCount++;
        else {
            wrongAnswerCount++;
            System.out.println(" ");
        }
    }
}