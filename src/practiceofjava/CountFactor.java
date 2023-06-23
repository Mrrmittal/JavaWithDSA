package practiceofjava;

import java.util.Scanner;

public class CountFactor {
    public static void find(int number){
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        find(number);
    }

}
