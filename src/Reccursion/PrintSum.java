package Reccursion;

import java.util.Scanner;

public class PrintSum {
    public static void Sum(int i,int number, int total){
        if(i==number+1){
            System.out.println(total);
            return;
        }
        System.out.println(i);
        total += i;

        Sum(i+1,number,total);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = sc.nextInt();
        int total = sc.nextInt();
        Sum(i,number,total);


    }
}
