package personal;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String[] otherNames= {"Java", "Python", "Javascript", "Golang", "C++"};
        String[] name = new String[5];
        for (int i = 0; i < name.length; i++) {
            System.out.println ("Enter a name: ");
            name[i] = input.nextLine ();
        }
        System.out.println (Arrays.toString (otherNames));
        System.out.println (Arrays.toString (name));
    }
}
