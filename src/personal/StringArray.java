package personal;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String[] names = new String[3];
        String[] anotherNames = {"Wale", "Shola", "Joy","Kelvin"};

        for (int i = 0; i < names.length; i++) {
            System.out.println ("Enter names: ");
            names[i] = input.nextLine();
        }
        System.out.println (Arrays.toString (anotherNames));
        System.out.println (Arrays.toString (names));
    }
}
