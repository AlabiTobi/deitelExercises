package chapterThree;

public class Arrays {
    public static void main (String[] args) {
        String[][] array = new String[3][3];
    array[0][0] = "X";
    array[0][1] = "O";
    array[0][2] = " ";
    array[1][0] = "X";
    array[1][1] = "X";
    array[1][2] = "X";
    array[2][0] = "O";
    array[2][1] = "X";
    array[2][2] = "O";

        System.out.println (array[0][0] + "   " + array[0][1] + "   " + array[0][2]);
        System.out.println (array[1][0] + "   " + array[1][1] + "   " +  array[1][2]);
        System.out.println (array[2][0] + "   " + array[2][1] + "   " + array[2][2]);
//        for (int i = 0; i < 300; i++) {
//            array[i] = i + 1;
//
//
//            System.out.print (array[i] + " ");
//        }
//            System.out.println ();
        }
    }

