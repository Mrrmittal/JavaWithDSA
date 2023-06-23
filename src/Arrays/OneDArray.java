package Arrays;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i =0;i<10;i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<10;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
