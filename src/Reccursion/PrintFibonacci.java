package Reccursion;


import java.util.Scanner;

public class PrintFibonacci {
    public void Fibonacci(int num1,int num2, int n,int ask){
    if(n==ask){
        return;
    }
        System.out.println(num1);
        n += 1;
        int num3= num1+num2;
        num1=num2;
        num2=num3;
        Fibonacci(num1,num2,n,ask);
    }
    public static void main(String[] args) {
        PrintFibonacci myNum = new PrintFibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user ask nth term : ");
        int ask = sc.nextInt();
        myNum.Fibonacci(0,1,0,ask);

    }
}
