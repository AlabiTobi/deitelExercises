package tddClass;

import java.security.SecureRandom;
import java.util.Scanner;

public class SentinelleLoop {
    public static void main(String... args){
        int count=0;
        SecureRandom random= new SecureRandom();
        Scanner input= new Scanner(System.in);
        for(;count <=100;){
            System.out.println("Enter a score or enter anything more than 100 on it");
            count=input.nextInt();
            System.out.println("collected");
        }
    }
}
