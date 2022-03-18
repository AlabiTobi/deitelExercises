package chapterThree;

public class Practice {
    public static void main (String[] args) {
        calculateScore (true, 10000, 8, 200);
        double numberPound = 0.42269;
        double convertedKilogram = numberPound * 2;
        System.out.println (convertedKilogram);
        double firstNumber = 20.00;
        double secondNumber = 40.00;
        double addBoth = firstNumber + secondNumber;
        System.out.println ("The result is = " + addBoth);
        addBoth = addBoth % secondNumber;
        System.out.println ("Remainder is =" + addBoth);
        boolean numberFour = false;
        if (numberFour == false) {
            System.out.println ("false of not zero");
        } else {
            System.out.println ("is not true");
        }
        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println ("Your final score was " + finalScore);
        }

    }

    public static int calculateScore (boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            System.out.println ("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}

