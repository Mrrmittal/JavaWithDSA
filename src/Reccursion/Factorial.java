package Reccursion;

import java.util.Scanner;

public class Factorial {
    public static void fact(int number, int stop, int product){
        if(number == stop){
            System.out.println(product);
            return;
        }
        System.out.println(number);
        product *= number;
        fact(number-1,stop,product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fact(number,0,1);

    }
}
