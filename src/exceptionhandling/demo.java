package exceptionhandling;

public class demo {
    public static void main(String[] args) {
        int num1 =6;
        int num2 = 0;
        int result = 0;
        try{
            System.out.println("Hello"); //This line will be print
            result = num1/num2;
            System.out.println("In try block"); //but this will not
        }
        catch (Exception obj){
            System.out.println("Something went wrong... " +obj);
        }

        System.out.println(result);
        System.out.println("bye");
    }
}
