package chapterTwo;

import java.util.Scanner;
    public class fiveNumber{
    public static void main (String [] args){
Scanner input = new Scanner (System.in);

System.out.print ("Enter first integer: ");
    int Number1 = input.nextInt();

System.out.print ("Enter second integer: ");
    int Number2 = input.nextInt ();

System.out.print ("Enter third integer: ");
    int Number3 = input.nextInt ();

System.out.print ("Enter forth integer: ");
    int Number4 = input.nextInt ();

System.out.print ("Enter fifth integer: ");
    int Number5 = input.nextInt ();

if (Number1>Number2 && Number1>Number3 && Number1>Number4 && Number1>Number5){
System.out.println ("the biggest number is:" + Number1);
}

if (Number2>Number1 && Number2>Number3 && Number2>Number4 && Number2>Number5){
System.out.println ("the biggest number is:" + Number2);
}

if (Number3>Number1 && Number3>Number2 & Number3>Number4 && Number3>Number5){
System.out.println ("the biggest number is:" + Number3);
}

if (Number4>Number1 && Number4>Number2 && Number4>Number3 && Number4>Number5){
System.out.println ("the biggest number is:" + Number4);
}

if (Number5>Number1 && Number5>Number2 && Number5>Number3 && Number5>Number4){
System.out.println ("the biggest number is:" + Number5);
}

if (Number1<Number2 && Number1<Number3 && Number1<Number4 && Number1<Number5){
System.out.println ("the smallest number is:" + Number1);
}
if (Number2<Number1 && Number2<Number3 && Number2<Number4 && Number2<Number5){
System.out.println ("the smallest number is:" + Number2);
}

if (Number3<Number1 && Number3<Number2 && Number3<Number4 && Number3<Number5){
System.out.println ("the smallest number is:" + Number3);
}
if (Number4<Number1 && Number4<Number2 && Number4<Number3 && Number4<Number5){
System.out.println ("the smallest number is:" + Number4);
}

if (Number5<Number1 && Number5<Number2 && Number5<Number3 && Number5<Number4){
System.out.println ("the smallest number is:" + Number5);
}

}
}
