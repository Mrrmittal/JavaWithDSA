package dsaseries450;

import java.util.Scanner;

public class ReverseArray {
    public void reverse(int arr[]) {
        System.out.println("Reverse array is :  ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        ReverseArray myObj = new ReverseArray();
        int arr[] = new int[10];
//        Input an array
        System.out.println("Enter the element for an array : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        myObj.reverse(arr);
    }
}
