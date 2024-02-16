// WAP that print largest number among three.

package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number : ");
        int num3 = sc.nextInt();

        int maxNum = 0;

        if(num1 > maxNum){
            maxNum = num1;
        }
        if(num2 > maxNum){
            maxNum = num2;
        }
        if (num3 > maxNum){
            maxNum = num3;
        }

        System.out.println("Max number is : " +maxNum);

//        By using Math library.

        int max = Math.max(num3, Math.max(num1,num2));
        System.out.println("Max number is : " +max);
    }
}