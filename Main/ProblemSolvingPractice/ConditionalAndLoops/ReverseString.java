package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class ReverseString {

    public static void reverse(String str){
        String newStr = "";
        int i= str.length()-1;
        while( i >= 0){
            newStr =  newStr + str.charAt(i);
            i--;
        }
        System.out.println("Reverse String is : "+newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a String : ");
            String str = sc.nextLine();
            reverse(str);

        }
    }
}
