package Arrays;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list of array : ");
        int [] arr = new int[5];

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your Element : ");
        int element = sc.nextInt();
        System.out.println("Enter your location ");
        int location = sc.nextInt();

        for(int i=arr.length-2;i>location-1;i--){
            arr[i] = arr[i-1];

        }
        arr[location]=element;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
