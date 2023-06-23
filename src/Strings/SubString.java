package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String sentense;
        System.out.println("Enter your sentense : ");
        Scanner sc = new Scanner(System.in);
        sentense = sc.nextLine();
        System.out.println(sentense.substring(0,sentense.length()));
    }
}
