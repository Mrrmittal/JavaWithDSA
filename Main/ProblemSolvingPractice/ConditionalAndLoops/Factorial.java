package Main.ProblemSolvingPractice.ConditionalAndLoops;

//WAP to print factorial of a number

import java.util.Scanner;

public class Factorial {
    int fact = 1;
    public static void factorial(int num){
        int fact = 1;
        if(num < 0){
            System.out.println("Please enter Positive number");
        }
        if(num == 0 || num == 1){
            System.out.println("Factorial of " +num +"is :" +fact);
        }
        else{
            while(num > 1){
             fact = fact * num;
             num--;
            }
            System.out.println("Factorial of " +num +" is :" +fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            factorial(num);
        }
    }
}
