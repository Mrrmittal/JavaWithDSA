package Main.ProblemSolvingPractice.ConditionalAndLoops;
//WAP to find HCF and LCM of Two Numbers; LCM * HCF = Product of two number;

import java.util.Scanner;

public class HCFAndLCM {

    public static int findHCF(int num1, int num2){
        while (num2 != 0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;

    }

    public static int findLCM(int num1, int num2){
        int LCM = (num1 * num2) / findHCF(num1,num2);
        return LCM;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("HCF of given number is : " + findHCF(num1,num2));
        System.out.println("HCF of given number is : " + findLCM(num1,num2));
    }
}
