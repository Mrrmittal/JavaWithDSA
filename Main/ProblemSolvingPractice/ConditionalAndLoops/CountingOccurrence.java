// WAP to count the occurrence of the specific digit in a number.


package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class CountingOccurrence {
    long num;
    long digit;

    public CountingOccurrence(long num, long digit){
        this.num = num;
        this.digit = digit;
    }

    public void checkOccurrence(long num, long digit){
        int count = 0;
        while (num > 0){
            long lastDigit = num%10;
            if(lastDigit == digit){
                count++;
            }
            num = num/10;
        }
        System.out.println("Number of occurrences is : " +count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        long num = sc.nextLong();
        System.out.println("Enter digit to check Occurrences : ");
        long digit = sc.nextLong();

        CountingOccurrence obj = new CountingOccurrence(num,digit);
        obj.checkOccurrence(num,digit);
    }
}
