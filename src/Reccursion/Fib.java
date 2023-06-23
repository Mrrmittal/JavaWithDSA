package Reccursion;

import java.util.Scanner;

public class Fib {
    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner term = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = term.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2);

    }
}
