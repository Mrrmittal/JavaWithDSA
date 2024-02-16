package Main.ProblemSolvingPractice.ConditionalAndLoops;

import java.util.Scanner;

public class Calculator{

    public void calculate(char op, int num1, int num2){
        int result = 0;
        while(true){
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                if(op=='+'){
                    result = num1 + num2;
                    System.out.println("Result is : " +result);
                }
                if(op=='-'){
                    result = num1 - num2;
                    System.out.println("Result is : " +result);
                }
                if(op=='*'){
                    result = num1 * num2;
                    System.out.println("Result is : " +result);
                }
                if(op=='/'){
                    try {
                        result = num1 / num2;
                        System.out.println("Result is : " + result);
                    }
                    catch (Exception e){
                        System.out.println("Sorry,Can not divide any number by zero " +e);
                    }
                }
                if(op=='%'){
                    result = num1 % num2;
                    System.out.println("Result is : " +result);
                }
                break;
            }
            else{
                System.out.println("Only arithmetic operation can perform");
                break;
            }
            }
        System.out.println("Thank you for using");
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator : ");
        char operator = sc.next().trim().charAt(0);

        calculator.calculate(operator,num1,num2);

    }
}
