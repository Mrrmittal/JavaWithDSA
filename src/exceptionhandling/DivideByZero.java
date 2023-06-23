package exceptionhandling;

public class DivideByZero {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Hello!");
    }
}