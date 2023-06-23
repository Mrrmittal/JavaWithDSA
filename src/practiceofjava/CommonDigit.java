package practiceofjava;

import java.util.Scanner;

public class CommonDigit {
    public static boolean check(int num1, int num2){
        for(int i=0;i<10;i++){
            if(num1%10 == num2%10){
                return true;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean check = check(num1,num2);
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
        }

    }
}
