package chapterThree;

public class ifDemo {
    public static void main (String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                for (int x = 0; x <= j ; x++) {
                    System.out.print ("O ");
                }

                System.out.print ("* ");
            }

            System.out.println ();
        }


//        if (i == 10)
//            System.out.println ("10 is less than 15");
//            if (i <15)
//                System.out.println ("10 is greater");
//            if (i <12)
//                System.out.println ("10 is lesser too");
//            else
//                System.out.println ("I am Not in if");
        }
    }


