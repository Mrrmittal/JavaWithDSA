package exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        int num;
        try{
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("Please Enter a Number");
            System.out.println(e);
        }

        System.out.println("Thanks");
    }
}

