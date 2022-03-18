package chapterTwo;

import java.util.Scanner;

public class ConvertFeet {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in feet: ");
		
        double feet = input.nextDouble();
		
		double meters = feet * 0.305;
System.out.println( feet + "feet is" +meters+ "meters");
	}
}
