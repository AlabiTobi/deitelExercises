package personal;

public class Loops {
    public static void main (String[] args) {
//        decrement of 2
        for (int i = 20; i >= 2; i -= 2) {
            System.out.print (" " + i);
        }
//        increment of 3
        System.out.println ();
        for (int j = 2; j <= 20; j += 3){
            System.out.print (" " + j);
        }
//        decrement of 11
        System.out.println ();
        for(int y = 99; y>=0; y -=11) {
            System.out.print (" " + y);
        }
//        increment of 1
        System.out.println ();
        for(int z= 1; z <= 100; z++){
            System.out.print (" " + z);
    }
//        decrement of 1
        System.out.println ();
        for (int a = 100; a >= 1 ; a--) {
            System.out.print (" " + a);
        }
//        increment of 7
        System.out.println ();
        for (int b = 7; b <= 77; b+= 7) {
            System.out.print (" " + b);
        }
        System.out.println ();
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print (" ");
            }
                for (int j = i; j <= 5; j++) {
                    System.out.print ("* ");
        }
                System.out.println ();
    }
}
    }