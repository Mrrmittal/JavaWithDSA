package Arrays;

import java.util.*;

public class InsertAnElement {
    public static void main(String[] args) {
        System.out.println("Enter Size of an element : ");
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int [] arr = new int[Size];
        System.out.println("Enter Elements of an Array :");
        for(int i =0; i<Size;i++){
            arr[i] = sc.nextInt();
        }
        int Element;
        int Location;
        System.out.println("Enter an element : ");
        Element = sc.nextInt();
        System.out.println("Enter an Location : ");
        Location = sc.nextInt();

        for(int i=Size-1;i>Location-1;i--){
            arr[i]=arr[i-1];
        }
        arr[Location-1]=Element;
        for(int i=0;i<Size;i++){
            System.out.println(arr[i]);
        }
    }
}
