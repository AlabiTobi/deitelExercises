package tddClass;

public class Kata {
    public int addition(int num1, int num2) {return num1 + num2;
    }

    public int subtraction(int num1, int num2)
    {if (num1 > num2)
        return num1 - num2;
        if (num2 > num1) return num2 - num1; return 0;
    }

    public double circleArea(int radius) {return (22*radius*radius)/7.0;
    }

    public int flip(int num) {if (num == 1) return 0;
        if (num == 0) return 1; return  num;}

    public int quotient(int firstNumber, int secondNumber) {
        int num1= firstNumber;
        int num2= secondNumber;
        if (secondNumber > firstNumber){
        }
        if(num2==0){
            return 0;
        }
        return num1/num2;
    }
}
