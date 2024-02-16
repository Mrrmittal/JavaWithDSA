package Main.ProblemSolvingPractice.ConditionalAndLoops;
//WAP to sum of n numbers in Java

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of Given Number is : " +sum);
    }
}
