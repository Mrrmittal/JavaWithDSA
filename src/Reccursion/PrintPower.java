package Reccursion;

import java.util.Scanner;

public class PrintPower {
    public static void powerNumber(int x,int n){
        if(n==0){
            return;
        }
        System.out.println(x);
        x *= x;
        powerNumber(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the value of n :");
        int n = sc.nextInt();
        powerNumber(6,n);
    }
}
