package Arrays;

import java.util.Scanner;

public class DeleteAnElement {
    public static void main(String[] args) {
        int[] arr = {77,89,87,91,90,98};
        int location;
        System.out.println("Enter Location index : ");
        Scanner sc = new Scanner(System.in);
        location = sc.nextInt();

        for(int i=0; i<location-1; i++){
            System.out.println(arr[i]);
        }
        for(int i=location; i<6;i++){
            System.out.println(arr[i]);
        }
    }
}
