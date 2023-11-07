package JavaFunctions;
// WAP to Swap two numbers

import java.util.Scanner;

public class SwapTwoNumbers {
    public void swapNumber(){
//        Input first number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first number : ");
        int numb1 = sc.nextInt();

        System.out.println("Enter Your Second Number : ");
        int numb2 = sc.nextInt();

        int temp = 0; // Intialize a temp variable
         temp = numb1;
         numb1 = numb2;
        numb2 = temp;

        System.out.println("After swapping, First number will be : " + numb1);
        System.out.println("After swapping, Second number will be : " + numb2);
    }

    public static void main(String[] args) {
        SwapTwoNumbers obj1 = new SwapTwoNumbers();
        obj1.swapNumber();
    }
}
