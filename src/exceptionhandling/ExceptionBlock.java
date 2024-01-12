package exceptionhandling;

public class ExceptionBlock {
    public static void main(String[] args) {
        int a = 30;
        int b = 15;
        int value[] = {1,2,3,4};
        try {
            int result = a / b;
            System.out.println(result);
            System.out.println(value[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error in array");
            System.out.println(e);
        }

        System.out.println("bye");
    }
}
