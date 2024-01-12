package practiceofjava;
// Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

import java.util.Scanner;

public class SameNumber {

    public void checkSame(int num1, int num2, int num3, int num4){
        if(num1==num2 && num2==num3 && num3 == num4){
            System.out.println("All numbers are same");
        }
        else {
            System.out.println("Different Numbers");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number :");
        int num1 = sc.nextInt();
        System.out.println("Enter your Second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter your Third number :");
        int num3 = sc.nextInt();
        System.out.println("Enter your Fourth number :");
        int num4 = sc.nextInt();

        SameNumber obj = new SameNumber();
        obj.checkSame(num1,num2,num3,num4);
    }
}
