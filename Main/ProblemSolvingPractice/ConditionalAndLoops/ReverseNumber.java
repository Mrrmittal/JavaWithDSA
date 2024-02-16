//WAP to reverse a number

package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class ReverseNumber {

//    Method for reversing a number
    public void reverseNumber(int num){
        int reverse =0;
        while (num > 0){
            int lastNumber = num%10;
            reverse = reverse * 10 + lastNumber;
            num = num/10;
        }
        System.out.println("Reverse number is : " +reverse);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int num = sc.nextInt(); //Input a number

        ReverseNumber reverseNum = new ReverseNumber();
        reverseNum.reverseNumber(num); // Call function reverseNumber to print reverse number.

    }
}


