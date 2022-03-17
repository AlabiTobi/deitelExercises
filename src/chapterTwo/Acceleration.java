package chapterTwo;

import java.util.Scanner;

public class Acceleration {
public static void main (String [] args){

Scanner input= new Scanner (System.in);

System.out.print("Enter v1, v0 and t:");
int v1 = input.nextInt();
int v0 = input.nextInt();
int t = input.nextInt();


int a = (v1-v0) / t;

System.out.println("the average acceleration is:" +a);


}
}

