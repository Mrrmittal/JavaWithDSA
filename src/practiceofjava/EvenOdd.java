package practiceofjava;

import java.util.Scanner;

public class EvenOdd {
    public boolean check(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenOdd mynum = new EvenOdd();
        boolean check = mynum.check(num);
        if(check){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
