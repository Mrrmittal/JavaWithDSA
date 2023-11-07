package JavaFunctions;


import java.util.Scanner;

public class SumTwoNumber {
    //Define function for sum two numbers
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum of a and b is : " +sum);
    }

    //Define another  function ask input from user
    public void sumWithInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int num2 = sc.nextInt();

        int sumWithInput = num1 + num2;
        System.out.println("Sum of my two number is : " +sumWithInput);
    }

    public static void main(String[] args) {
        SumTwoNumber obj1 = new SumTwoNumber();
        obj1.sum(5,7);
        obj1.sumWithInput();
    }
}
