package tddClass;

public class Kata {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        if (num1 > num2)
            return num1 - num2;
        if (num2 > num1) return num2 - num1;
        return 0;
    }

    public double circleArea(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int num) {
        if (num == 1) return 0;
        if (num == 0) return 1;
        return num;
    }

    public int quotient(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        if (secondNumber > firstNumber) {
        }
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int bigNumber(int number1, int number2, int number3, int number4, int number5) {
        int bigestNumber = 0;

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            bigestNumber = number1;
        }
        if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            bigestNumber = number2;
        }
        if (number3 > number1 && number3 > number2 &&
                number3 > number4 && number3 > number5) {
            bigestNumber = number3;
        }
        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
            bigestNumber = number4;
        }
        if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
            bigestNumber = number5;
        }
        return bigestNumber;
    }

    public int factorNumber(int integer) {
        int myNumber = 1;
        for (int number = 1; number < integer; number++) {

            if (integer % number == 0) {
                myNumber++;
            }
        }
        return myNumber;
    }

    public boolean primeNumber(int integer) {
        int myNumber = 1;
        for (int number = 1; number < integer; number++) {

            if (integer % number == 0) {
                myNumber++;
            }
        }
        return myNumber <= 2;
    }

}
