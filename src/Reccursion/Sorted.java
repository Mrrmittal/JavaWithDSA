package Reccursion;

import java.util.Scanner;
public class Sorted {
    public static int temp =0;
    public static boolean sortedList(int number[], int index) {
        if (index < number.length) {
            return true;
        }
        if (number[index] < number[index + 1]) {
            return sortedList(number, index + 1);
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list of number : ");
        int[] number = new int[3];
        for(int i =0;i<number.length;i++){
            number[i] = sc.nextInt();
        }
        sortedList(number,0);
    }
}
