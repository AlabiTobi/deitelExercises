package chapterThree;

import java.util.Scanner;

public class ArrayStudentGrade {
    public static void main (String[] args) {
        String[][] student = new String[4][4];
        student[0][0] = "student";
        student[0][1] = " ";
        student[0][2] = " ";
        student[0][3] = " ";
        student[0][4] = " ";
        System.out.println ("Enter Student Name ");
        student[1][0] = "grade";
        student[1][1] = " ";
        student[1][2] = " ";
        student[1][3] = " ";
        student[1][4] = " ";
        for (int i = 0; i < student.length; i++) {
            System.out.println (student[i] + " ");

            System.out.println ();
        }
        for (int j = 0; j < student.length; j++) {
            System.out.println (student[j]+ " ");
        }
        System.out.println ();

    }

}

