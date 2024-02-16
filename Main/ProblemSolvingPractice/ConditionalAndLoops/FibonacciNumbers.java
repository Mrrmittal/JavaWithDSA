package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

/*
 nth number of a series is the sum of previous two numbers. These are known as fibonacci series
 For eg 0 1 1 2 3 5 8 13 21 34 55 .......
 */
public class FibonacciNumbers {

    public void printFibonacci(int length){
        int firstTerm = 0;
        int secondTerm = 1;
        int i = 0;
        while (i < length){
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
    public static void main(String[] args) {
        FibonacciNumbers obj = new FibonacciNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length for an Fibonacci series : ");
        int length = sc.nextInt();
        System.out.println("Fibonacci Series up to " + length + " terms:");
        obj.printFibonacci(length);
    }
}
