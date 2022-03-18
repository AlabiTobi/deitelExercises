package chapterTwo;

import java.util.Scanner;

public class CalculatingEnergy {
public static void main (String [] args){

Scanner input= new Scanner (System.in);

System.out.print("Enter the amount of water in kilogram:");
double kilograms = input.nextDouble();

System.out.print("Enter the initial temperature:");
double initialTemperature = input.nextDouble();

System.out.print("Enter the final temperature:");
double finalTemperature = input.nextDouble();


double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

System.out.println ("the energy is needed:" + energy);


}
}
