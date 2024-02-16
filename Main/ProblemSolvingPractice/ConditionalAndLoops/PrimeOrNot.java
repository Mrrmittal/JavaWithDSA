package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class PrimeOrNot {
    int num;
    int counts =0;

    public void check(int num){
        for(int i = 2; i < num/2; i++){
            if(num%i*i == 0){
                counts++;
            }
        }
    }
    public void isPrime(int num){
        check(num);
        if(counts == 0 ){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        PrimeOrNot obj = new PrimeOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an number");
        int num = sc.nextInt();
        obj.isPrime(num);

    }
}
